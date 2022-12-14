package com.startjava.lesson_1.finaltask;

public class Calculator {

    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        int result = 0;
        char sign = '*';
        boolean wrong = false;

        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign =='*') {
            result = a * b;
        } else if (sign == '/') {
            if (b == 0) {
                wrong = true;
            } else {
                result = a / b;
            }
        } else if (sign == '^') {
            result = 1;
            for (int i = b; i != 0; i--) {
                result *= a;
            }
        } else if (sign == '%') {
            if (b == 0) {
                wrong = true;
            } else {
                result = a % b;
            }
        }
        if (wrong) {
            System.out.println("Ошибка");
        } else {
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }
    }
}