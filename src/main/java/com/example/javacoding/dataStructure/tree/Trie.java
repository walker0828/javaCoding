package com.example.javacoding.dataStructure.tree;

public class Trie {
    private TrieNode root = new TrieNode('/');

    public class TrieNode {
        public char data;
        public TrieNode[] children = new TrieNode[26];
        public boolean isEndingChar = false;
        public TrieNode(char data) {
            this.data = data;
        }
    }

    public void insert() {

    }

    public boolean find(char[] pattern) {
        return false;
    }

}
