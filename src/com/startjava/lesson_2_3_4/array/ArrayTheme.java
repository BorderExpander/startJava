package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Реверс значений массива");
        int[] intArr = {5, 3, 4, 7, 6, 2, 1};
        int len = intArr.length - 1;
        printIntArray(intArr);
        for (int i = 0; i < len / 2; i++, len--) {
            int temp = intArr[i];
            intArr[i] = intArr[len];
            intArr[len] = temp;
        }
        printIntArray(intArr);

        System.out.println("\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        len = intArr.length;
        for (int i = 0; i < len; i++) {
            intArr[i] = i;
        }
        int prodDigits = 1;
        for (int i = 1; i < len - 1; i++) {
            prodDigits *= intArr[i];
            System.out.print(intArr[i] + (i != len - 2 ? " * " : " = " + prodDigits));
        }
        System.out.println("\n" + intArr[0] + " " + intArr[9]);

        System.out.println("\n3. Удаление элементов массива");
        double[] randomNums = new double[15];
        len = randomNums.length;
        for (int i = 0; i < len; i++) {
            randomNums[i] = Math.random();
        }
        System.out.println("Исходный массив:");
        printDoubleArray(randomNums);
        double middleArrNum = randomNums[len / 2];
        int countNullableNum = 0;
        System.out.printf("Число из середины массива: %6.3f\n", middleArrNum);
        for (int i = 0; i < len; i++) {
            if (randomNums[i] > middleArrNum) {
                randomNums[i] = 0;
                countNullableNum++;
            }
        }
        printDoubleArray(randomNums);
        System.out.println("Всего обнулённых значений: " + countNullableNum);

        System.out.print("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabet = new char[26];
        len = alphabet.length;
        for (int i = 0; i < len; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        for (int i = len; i >= 0; i--) {
            for (int j = len - 1; j >= i; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }

        System.out.print("\n5. Генерация уникальных чисел");
        int[] uniqueArr = new int[30];
        len = uniqueArr.length;
        for (int i = 0; i < len; i++) {
            int randomNum;
            do {
                randomNum = generateRandomNum(60, 100);
            } while (!isUnique(uniqueArr, randomNum));
            uniqueArr[i] = randomNum;
        }
        Arrays.sort(uniqueArr);
        for (int i = 0; i < len; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.printf("%3d", uniqueArr[i]);
        }

        System.out.print("\n\n6. Сдвиг элементов массива\n");
        String[] srcArray = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int countNotBlank = 0;
        for (String element : srcArray) {
            if (!element.isBlank()) {
                countNotBlank++;
            }
        }
        String[] destArray = new String[countNotBlank];
        int srcPos = 0;
        int destPos = 0;
        len = 0;

        for (int i = 0; i < srcArray.length; i++) {
            if (!srcArray[i].trim().equals("") && (len < i || srcPos == 0)) {
                srcPos = i;
                len = 0;
                for (int j = i; j < srcArray.length; j++) {
                    if (srcArray[j].trim().equals("")) {
                        System.arraycopy(srcArray, srcPos, destArray, destPos, len);
                        destPos += len;
                        len = j - 1;
                        break;
                    }
                    len++;
                }
            }
        }


        System.out.println("Исходный массив:");
        printStringArray(srcArray);
        System.out.println("\nНовый массив:");
        printStringArray(destArray);
    }

    private static void printIntArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(double[] array) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            if (i == len / 2 + 1) {
                System.out.println();
            }
            System.out.printf("%6.3f", array[i]);
        }
        System.out.println();
    }

    private static void printStringArray(String[] lines) {
        System.out.printf("|");
        for (String line : lines) {
            System.out.printf("%4s|", line);
        }
        System.out.println();
    }

    private static int generateRandomNum(int min, int max) {
        return (int) (min + (Math.random() * (max - min)));
    }

    private static boolean isUnique(int[] array, int num) {
        for (int element : array) {
            if (num == element) {
                return false;
            }
        }
        return true;
    }

}
