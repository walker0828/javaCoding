package com.example.javacoding.netty;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

public class NioServer {
    private ServerSocketChannel serverSocketChannel;

    private Selector selector;

    public NioServer() throws IOException {
        serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.socket().bind(new InetSocketAddress(8080));
        selector = Selector.open();

        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        handleKeys();
    }

    private void handleKeys(){

    }

    public static void main(String[] args) throws IOException {
        NioServer nioServer = new NioServer();
    }
}
