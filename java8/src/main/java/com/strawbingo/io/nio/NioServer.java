package com.strawbingo.io.nio;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 */
public class NioServer {

    private int port;
    private Selector selector;
    private ExecutorService service = Executors.newFixedThreadPool(5);

    public static void main(String[] args){
        new NioServer(9999).start();
    }

    public NioServer(int port) {
        this.port = port;
    }

    public void init() {
        ServerSocketChannel ssc = null;
        try {
            //用open创建对象，Opens a server-socket channel
            ssc = ServerSocketChannel.open();
            //Adjusts this channel's blocking mode
            ssc.configureBlocking(false);
            //Binds the channel's socket to a local address and configures the socket to listen for connections
            ssc.bind(new InetSocketAddress(port));

            //创建Selector对象，Opens a selector
            selector = Selector.open();
            ssc.register(selector, SelectionKey.OP_ACCEPT);
            System.out.println("NioServer started ......");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
        }
    }

    public void accept(SelectionKey key) {
        try {
            ServerSocketChannel ssc = (ServerSocketChannel) key.channel();
            SocketChannel sc = ssc.accept();

            sc.configureBlocking(false);
            sc.register(selector, SelectionKey.OP_READ);
            System.out.println("accept a client : " + sc.socket().getInetAddress().getHostName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        this.init();
        while (true) {
            try {
                //阻塞操作，Return he number of keys
                int events = selector.select();
                if (events > 0) {
                    Iterator<SelectionKey> selectionKeys = selector.selectedKeys().iterator();
                    while (selectionKeys.hasNext()) {
                        SelectionKey key = selectionKeys.next();
                        selectionKeys.remove();
                        if (key.isAcceptable()) {
                            accept(key);
                        } else {
                            service.submit(new NIOServerHandler(key));
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static class NIOServerHandler implements Runnable{

        private SelectionKey selectionKey;

        public NIOServerHandler(SelectionKey selectionKey) {
            this.selectionKey = selectionKey;
        }

        @Override
        public void run() {
            try {
                if (selectionKey.isReadable()) {
                    SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
                    ByteBuffer buffer = ByteBuffer.allocate(1024);
                    socketChannel.read(buffer);
                    buffer.flip();
                    System.out.println("收到客户端"+socketChannel.socket().getInetAddress().getHostName()+"的数据："+new String(buffer.array()));
                    //将数据添加到key中
                    ByteBuffer outBuffer = ByteBuffer.wrap(buffer.array());
                    socketChannel.write(outBuffer);// 将消息回送给客户端
                    selectionKey.cancel();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
