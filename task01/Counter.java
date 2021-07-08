package com.epam.unit06.task01;

public class Counter {

	private int val;
	private int min;
	private int max;

	public Counter() {
		val = 0;
		min = 0;
		max = 100;
	}

	public Counter(int x) {
		val = x;
		min = 0;
		max = 100;
	}

	public Counter(int x, int a, int b) {
		val = x;
		min = a;
		max = b;
	}

	public int getMinVal() {
		return min;
	}

	public void setMinVal(int min) {
		this.min = min;
	}

	public int getMaxVal() {
		return max;
	}

	public void setMaxVal(int max) {
		this.max = max;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public int inc() {
		val = val + 1;
		if (val > max) {
			val = max;
		}
		return val;
	}

	public int dec() {
		val = val - 1;
		if (val < min) {
			val = min;
		}
		return val;
	}

}
