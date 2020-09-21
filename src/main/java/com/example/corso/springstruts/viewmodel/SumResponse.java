package com.example.corso.springstruts.viewmodel;

import java.io.Serializable;

public class SumResponse implements Serializable {
	private static final long serialVersionUID = 1L;

	private long left;
	private long right;
	private long sum;

	public long getLeft() {
		return left;
	}

	public void setLeft(long left) {
		this.left = left;
	}

	public long getRight() {
		return right;
	}

	public void setRight(long right) {
		this.right = right;
	}

	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}
}
