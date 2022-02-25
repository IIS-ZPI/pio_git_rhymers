package edu.kis.vh.nursery;

public class IntArrayStack {
    public static final int empty = -1;
    public static final int maxIndex = 11;

    private final int[] numbersArray  = new int[maxIndex + 1];
    private int total = empty;

    public void countIn(int in) {
        if (!isFull()) {
            numbersArray[++total] = in;
        }
    }

    public boolean callCheck() {
        return total == empty;
    }

    public boolean isFull() {
        return total == maxIndex;
    }

    protected int peekaboo() {
        if (callCheck()) {
            return empty;
        }
        return numbersArray[total];
    }

    public int countOut() {
        if (callCheck()) {
            return empty;
        }
        return numbersArray[total--];
    }

}
