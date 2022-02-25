package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private final IntArrayStack data;

    public DefaultCountingOutRhymer(IntArrayStack dataContainer) {
        this.data = dataContainer;
    }

    public DefaultCountingOutRhymer() {
        this(new IntArrayStack());
    }

    public void countIn(int in) {
        data.countIn(in);
    }

    public boolean callCheck() {
        return data.callCheck();
    }

    public boolean isFull() {
        return data.isFull();
    }

    protected int peekaboo() {
        return data.peekaboo();
    }

    public int countOut() {
        return data.countOut();
    }

}
