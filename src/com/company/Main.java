package com.company;

public class Main {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.bytes = 0b01101010;
        task1.shortNum = 100;
        task1.integer = 12457;
        task1.longNum = 123456789101L;
        task1.floatNum = 100.15487f;
        task1.doubleNum = 145.13213123121454;
        task1.char1 = 80;
        task1.boolean1 = true;

        task1.printInfo();

        Task2 task2 = new Task2();
        task2.num1 = 10_000_000;
        task2.num2 = 100.066_123_455;
        task2.num3 = 15_500_088.443_311_220_1;

        task2.printNumInfo();

        Task3 task3 = new Task3();
        task3.char1 = '\u24b8';
        task3.char2 = '\u00b5';
        task3.char3 = '\u24c7';

        task3.printCharInfo();
    }
}
