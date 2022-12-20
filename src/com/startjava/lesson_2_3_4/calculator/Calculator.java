package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int num1;
    private int num2;
    private char sign;

    public void setExpression(String expression) {
        String[] partsExpression = expression.split(" ");
        num1 = Integer.parseInt(partsExpression[0]);
        sign = partsExpression[1].charAt(0);
        num2 = Integer.parseInt(partsExpression[2]);
    }

    public int calculate(String expression) {
        setExpression(expression);

        switch(sign) {
            case '+':
                return Math.addExact(num1, num2);
            case '-':
                return num1 - num2;
            case '*':
                return Math.multiplyExact(num1, num2);
            case '/':
                return Math.floorDiv(num1, num2);
            case '^':
                return (int) Math.pow(num1, num2);
            case '%':
                return (int) Math.floorMod(num1, num2);
            default:
                System.out.println("Ошибка вычислений");
                return 0;
        }
    }
}