package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int num1;
    private int num2;
    private char sign;

    public void setExpression(String expression) {
        String[] partsExpression = expression.split(" ");
        validateNum(partsExpression);
        num1 = Integer.parseInt(partsExpression[0]);
        sign = partsExpression[1].charAt(0);
        num2 = Integer.parseInt(partsExpression[2]);
    }

    public int calculate(String expression) {
        setExpression(expression);
        return switch (sign) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> num1 - num2;
            case '*' -> Math.multiplyExact(num1, num2);
            case '/' -> Math.floorDiv(num1, num2);
            case '^' -> (int) Math.pow(num1, num2);
            case '%' -> Math.floorMod(num1, num2);
            default -> throw new IllegalStateException("Ошибка вычислений");
        };
    }

    private static void validateNum(String[] validationData) {
        if (!validationData[0].matches("\\d+") || !validationData[2].matches("\\d+")) {
            throw new IllegalStateException
                    ("Возможен ввод только целых, положительных чисел");
        }
    }
}