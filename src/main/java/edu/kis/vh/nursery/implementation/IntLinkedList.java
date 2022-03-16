package edu.kis.vh.nursery.implementation;

public class IntLinkedList implements RhymerInterface{

	private Node last;

	@Override
	public void push(int num) {
		if (last == null)
			last = new Node(num);
		else {
			last.next = new Node(num);
			last.next.prev = last;
			last = last.next;
		}
	}

	@Override
	public int getTotal() {
		int total = 0;
		Node r = last;
		do {
			if (last != null) {
				total++;
				r = r.prev;
			}
		} while (r.prev != null);
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return last == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int top() {
		return 0;
	}

	@Override
	public int pop() {
		if (isEmpty()) {
			return 0;
		}
		int num = last.value;
		last = last.prev;
		return num;
	}
}
