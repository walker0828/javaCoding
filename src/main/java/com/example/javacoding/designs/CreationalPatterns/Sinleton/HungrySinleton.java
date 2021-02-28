package com.example.javacoding.designs.CreationalPatterns.Sinleton;

public class HungrySinleton {
    private static final HungrySinleton intance = new HungrySinleton();

    private HungrySinleton() {}

    public static HungrySinleton getInstance() {
        return intance;
    }
}