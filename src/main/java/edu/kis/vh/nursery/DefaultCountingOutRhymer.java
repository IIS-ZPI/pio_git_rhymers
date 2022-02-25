package edu.kis.vh.nursery;

import edu.kis.vh.nursery.implementation.IntArrayStack;

public class DefaultCountingOutRhymer {
    private final IntArrayStack data;

    public DefaultCountingOutRhymer(IntArrayStack dataContainer) {
        this.data = dataContainer;
    }

    public DefaultCountingOutRhymer() {
        this(new IntArrayStack());
    }

    public void countIn(int in) {
        data.push(in);
    }

    public boolean callCheck() {
        return data.isEmpty();
    }

    public boolean isFull() {
        return data.isFull();
    }

    protected int peekaboo() {
        return data.top();
    }

    public int countOut() {
        return data.pop();
    }

}
