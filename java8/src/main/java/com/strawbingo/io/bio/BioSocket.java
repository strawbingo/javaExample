package com.strawbingo.io.bio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class BioSocket {
    int port = 4343; //端口号

    public void server(){

        // Socket 服务器端（简单的发送信息）
        Thread sThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ServerSocket serverSocket = new ServerSocket(port);
                    while (true) {
                        // 等待连接
                        Socket socket = serverSocket.accept();
                        Thread sHandlerThread = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                try (PrintWriter printWriter = new PrintWriter(socket.getOutputStream())) {
                                    printWriter.println("hello world！");
                                    printWriter.flush();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        });
                        sHandlerThread.start();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        sThread.start();
    }

    public void client(){
        try (Socket cSocket = new Socket(InetAddress.getLocalHost(), port)) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(cSocket.getInputStream()));
            bufferedReader.lines().forEach(s -> System.out.println("客户端：" + s));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        BioSocket bioSocket = new BioSocket();
//        bioSocket.client();
        bioSocket.server();

        bioSocket.client();

        bioSocket.client();

    }

}
