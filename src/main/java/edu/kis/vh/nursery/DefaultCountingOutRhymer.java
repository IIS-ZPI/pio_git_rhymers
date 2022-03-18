package edu.kis.vh.nursery;

import edu.kis.vh.nursery.implementation.IntArrayStack;
import edu.kis.vh.nursery.implementation.IntLinkedList;

public class DefaultCountingOutRhymer {
    private final IntArrayStack data;

    public DefaultCountingOutRhymer() {
        data = new IntArrayStack();
    }

    public DefaultCountingOutRhymer(IntArrayStack dataContainer) {
        this.data = dataContainer;
    }

    public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
        data = new IntArrayStack();
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
