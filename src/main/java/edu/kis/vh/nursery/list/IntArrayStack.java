package edu.kis.vh.nursery.list;

public class IntArrayStack implements RhymerInterface{
    public static final int empty = 0;
    public static final int maxIndex = 11;

    private final int[] numbersArray  = new int[maxIndex + 1];
    private int total = 0;


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
        return total == empty;
    }

    @Override
    public boolean isFull() {
        return total == maxIndex;
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
