package com.strawbingo.algorithm.cartoon.ch6;

public class MyBitMap {
    private long[] words;
    private int size;

    public MyBitMap(int size) {
        this.size = size;
        words = new long[getWordIndex(size-1) + 1];
    }

    public boolean getBit(int bitIndex) throws Exception {
        if(bitIndex <0 || bitIndex > size-1){
            throw new Exception("Index out of size!");
        }

        int wordIndex = getWordIndex(bitIndex);
        return (words[wordIndex] & (1L << bitIndex)) != 0;
    }

    public void setBit(int bitIndex) throws Exception {
        if(bitIndex <0 || bitIndex > size-1){
            throw new Exception("Index out of size!");
        }

        int wordIndex = getWordIndex(bitIndex);
        words[wordIndex] |= (1L << bitIndex);
    }

    private int getWordIndex(int bitIndex){
        return bitIndex >> 6;
    }
}
