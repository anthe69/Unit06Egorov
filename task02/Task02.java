package com.epam.unit06.task02;

public class Task02 {

	public static void main(String[] args) {

		// Составьте описание класса для представления времени. Предусмотрте
		// возможности установки времени и изменения его отдельных полей (час,
		// минута, секунда) с проверкой допустимости вводимых значений. В случае
		// недопустимых значений полей поле устанавливается в значение 0. Создать
		// методы изменения времени на заданное количество часов, минут и секунд

		Time t = new Time(25, 58, 70);

		System.out.printf("Установлено время: %02d:%02d:%02d\n", t.getHours(), t.getMinutes(), t.getSeconds());

		t.setHours(8);
		t.setMinutes(18);
		t.setSeconds(28);

		System.out.printf("Установлено новое время: %02d:%02d:%02d\n", t.getHours(), t.getMinutes(), t.getSeconds());

		t.add(10, 41, 50);
		System.out.printf("Время изменено: %02d:%02d:%02d\n", t.getHours(), t.getMinutes(), t.getSeconds());

	}

}
