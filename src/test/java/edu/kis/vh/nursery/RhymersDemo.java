package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.ArrayStackRhymerFactory;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.LinkedListRhymerFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

	public static void main(String[] args) {

		System.out.println("\n -- DefaultRhymersFactory -- ");
		testRhymers(new DefaultRhymersFactory());

		System.out.println("\n -- ArrayStackRhymerFactory -- ");
		testRhymers(new ArrayStackRhymerFactory());

		System.out.println("\n -- LinkedListRhymerFactory -- ");
		testRhymers(new LinkedListRhymerFactory());

	}

	private static void testRhymers(Rhymersfactory factory) {
		DefaultCountingOutRhymer[] rhymers = {
				factory.GetStandardRhymer(),
				factory.GetFalseRhymer(),
				factory.GetFIFORhymer(),
				factory.GetHanoiRhymer()
		};

		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				rhymers[j].countIn(i);

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++) {
			rhymers[3].countIn(rn.nextInt(20));
		}

		for (DefaultCountingOutRhymer rhymer : rhymers) {
			while (!rhymer.callCheck())
				System.out.print(rhymer.countOut() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is " + ((HanoiRhymer) rhymers[3]).reportRejected());

	}

}
