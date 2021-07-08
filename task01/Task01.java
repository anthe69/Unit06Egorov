package com.epam.unit06.task01;

public class Task01 {

	public static void main(String[] args) {

		// Опишите класс, реализующий счетчик, который может увеличивать или
		// уменьшать свое значение на единицу в заданном диапазоне.
		// Предусмотрите инициализацию счетчика значениями по умолчанию и
		// произвольными значениями. Счетчик имеет методы увеличения и
		// уменьшения состояния, и метод позволяющее получить его текущее
		// состояние. Написать код, демонстрирующий все возможности класса.

		Counter counter = new Counter();

		System.out.println("Значение счетчика = " + counter.getVal());
		System.out.println("Минимальное значение = " + counter.getMinVal());
		System.out.println("Максимальное значение = " + counter.getMaxVal());
		System.out.println();

		counter.setVal(150);
		counter.setMinVal(100);
		counter.setMaxVal(200);

		System.out.println("Значение счетчика = " + counter.getVal());
		System.out.println("Минимальное значение = " + counter.getMinVal());
		System.out.println("Максимальное значение = " + counter.getMaxVal());
		System.out.println();

		Counter counter_val = new Counter(10);
		counter_val.inc();

		System.out.println("Значение счетчика = " + counter_val.getVal());
		System.out.println("Минимальное значение = " + counter_val.getMinVal());
		System.out.println("Максимальное значение = " + counter_val.getMaxVal());
		System.out.println();

		Counter counter_all_val = new Counter(40,30,50);
		counter_all_val.dec();

		System.out.println("Значение счетчика = " + counter_all_val.getVal());
		System.out.println("Минимальное значение = " + counter_all_val.getMinVal());
		System.out.println("Максимальное значение = " + counter_all_val.getMaxVal());
		System.out.println();

	}

}
