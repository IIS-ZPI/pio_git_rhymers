package edu.kis.vh.nursery;

import edu.kis.vh.nursery.implementation.IntArrayStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer(new IntArrayStack());

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