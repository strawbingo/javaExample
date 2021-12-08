package com.strawbingo.io.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioBasic {

    public void channelBasic() throws IOException {
        RandomAccessFile aFile = new RandomAccessFile("/Users/leeco/GitHub/com/strawbingo/javaExample/java8/src/main/resources/readMe.txt", "rw");
        FileChannel inChannel = aFile.getChannel();

        ByteBuffer buf = ByteBuffer.allocate(48);

        int bytesRead = inChannel.read(buf);
        while (bytesRead != -1) {

            System.out.println("Read " + bytesRead);
            buf.flip();

            while(buf.hasRemaining()){
                System.out.print((char) buf.get());
            }

            buf.clear();
            bytesRead = inChannel.read(buf);
        }
        aFile.close();
    }

    public void BufferBasic() throws IOException {
        RandomAccessFile aFile = new RandomAccessFile("/Users/leeco/GitHub/com/strawbingo/javaExample/java8/src/main/resources/readMe.txt", "rw");
        FileChannel inChannel = aFile.getChannel();

        //create buffer with capacity of 48 bytes
        ByteBuffer buf = ByteBuffer.allocate(48);

        int bytesRead = inChannel.read(buf); //read into buffer.
        while (bytesRead != -1) {

            buf.flip();  //make buffer ready for read

            while(buf.hasRemaining()){
                System.out.print((char) buf.get()); // read 1 byte at a time
            }

            buf.clear(); //make buffer ready for writing
            bytesRead = inChannel.read(buf);
        }
        aFile.close();
    }

    public void BufferWrite() throws IOException {
        RandomAccessFile aFile = new RandomAccessFile("/Users/leeco/GitHub/com/strawbingo/javaExample/java8/src/main/resources/readMe.txt", "rw");
        FileChannel inChannel = aFile.getChannel();

        //create buffer with capacity of 48 bytes
        ByteBuffer buf = ByteBuffer.allocate(48);
        buf.clear();
        buf.put("345".getBytes());

//        System.out.println(inChannel.position());
//        inChannel.position(inChannel.size());
//        System.out.println(inChannel.position());

        buf.flip();
        while(buf.hasRemaining()){
            inChannel.write(buf);
        }


        aFile.close();

    }


    public static void main(String[] args) throws IOException {
        NioBasic nioBasic = new NioBasic();

//        nioBasic.channelBasic();

//        nioBasic.BufferBasic();
//
        nioBasic.BufferWrite();
    }

}
