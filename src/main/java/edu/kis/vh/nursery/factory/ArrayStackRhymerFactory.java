package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.implementation.IntArrayStack;
import edu.kis.vh.nursery.implementation.IntLinkedList;

public class ArrayStackRhymerFactory implements Rhymersfactory{

    @Override
    public DefaultCountingOutRhymer GetStandardRhymer() {
        return new DefaultCountingOutRhymer(new IntArrayStack());
    }

    @Override
    public DefaultCountingOutRhymer GetFalseRhymer() {
        return new DefaultCountingOutRhymer(new IntLinkedList());
    }

    @Override
    public DefaultCountingOutRhymer GetFIFORhymer() {
        return new FIFORhymer(new IntArrayStack());
    }

    @Override
    public DefaultCountingOutRhymer GetHanoiRhymer() {
        return new HanoiRhymer(new IntArrayStack());
    }
}