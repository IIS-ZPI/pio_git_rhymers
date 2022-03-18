package edu.kis.vh.nursery.implementation;

public class IntArrayStack implements RhymerInterface{
    public static final int maxIndex = 12;
    private final int[] numbersArray  = new int[maxIndex];
    private int total = -1;

    @Override
    public void push(int num) {
        if (!isFull()) {
            numbersArray[++total] = num;
        }
    }

    @Override
    public int getTotal() {
        return total;
    }

    @Override
    public boolean isEmpty() {
        return total == -1;
    }

    @Override
    public boolean isFull() {
        return total == maxIndex - 1;
    }

    @Override
    public int top() {
        if (isEmpty()) {
            return 0;
        }
        return numbersArray[total];
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return 0;
        }
        return numbersArray[total--];
    }
}
