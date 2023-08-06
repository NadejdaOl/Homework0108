package org.example;

// 1.В методе main инициализировать все примитивные типы и не примитивные типы.Вывести их результат в консоль:
//char: G
//int: 89
//byte: 4
//short: 56
//float: 4.7333436
//double: 4.355453532
//long: 12121

//        public class Main {
//            public static void main(String[] args) {
//
//
//                Character character = 'G';
//                Integer integer = 89;
//                Byte byteW = 4;
//                Short shortW = 56;
//                Float floatW = 4.7333436f;
//                Double doubleW = 4.355453532;
//                Long longW = 12121L;
//
//                System.out.println("Character: " + character);
//                System.out.println("Integer: " + integer);
//                System.out.println("Byte: " + byteW);
//                System.out.println("Short: " + shortW);
//                System.out.println("Float: " + floatW);
//                System.out.println("Double: " + doubleW);
//                System.out.println("Long: " + longW);
//            }
//
//        }
// 2.Дано трехзначное число. Вывести на экран все цифры этого числа.
//
//Пример: 345
//Вывод в консоль: Число 345 -> 3, 4, 5
public class Main {
    public static void main(String[] args) {
        int number = 345;

        int num1 = number / 100;
        int num2 = (number / 10) % 10;
        int num3 = number % 10;

        System.out.println("Число " + number + " -> " + num1 + ", " + num2 + ", " + num3);
    }
}
