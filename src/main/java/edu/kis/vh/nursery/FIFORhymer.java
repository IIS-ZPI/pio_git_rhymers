package edu.kis.vh.nursery;

import edu.kis.vh.nursery.implementation.IntArrayStack;
import edu.kis.vh.nursery.implementation.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer(new IntArrayStack());

    public FIFORhymer() {
        super();
    }

    public FIFORhymer(IntArrayStack intArrayStack) {
        super(intArrayStack);
    }

    public FIFORhymer(IntLinkedList intLinkedList) {
        super(intLinkedList);
    }

    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int returnValue = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return returnValue;
    }
}