package com.example.javacoding.netty;

import java.net.ServerSocket;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.List;

public class NioClient {
    public SocketChannel clientSocketChannel;

    private Selector selector;

    private final List<String> responseQueue = new ArrayList<>();
}
