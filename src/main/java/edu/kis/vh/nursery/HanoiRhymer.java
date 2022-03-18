package edu.kis.vh.nursery;

import edu.kis.vh.nursery.implementation.IntArrayStack;
import edu.kis.vh.nursery.implementation.IntLinkedList;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    public static final int empty = 0;
    int totalRejected = empty;

    public HanoiRhymer() {
        super();
    }

    public HanoiRhymer(IntArrayStack intArrayStack) {
        super(intArrayStack);
    }

    public HanoiRhymer(IntLinkedList intLinkedList) {
        super(intLinkedList);
    }


    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo()) {
            totalRejected++;
        } else {
            super.countIn(in);
        }
    }
}

// Polecenia alt + -> to skrót forward/back
