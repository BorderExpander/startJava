public class CyclesTheme{

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int startRange = -10;
        int endRange = 21;
        int currNum = startRange;
        int sumEven = 0; //четные
        int sumOdd = 0; //нечетные
        do {
            if (currNum  % 2 == 0) {
                sumEven += currNum;
            } else {
                sumOdd += currNum;
            }
            currNum++;
        } while (currNum <= endRange);
        System.out.println("\tВ промежутке [" + startRange + "," + endRange +"] Сумма чётных чисел "
            + " = " + sumEven +" Сумма нечётных чисел = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num2;
        if (num1 < num2) {
            max = num2;
            min = num1;
        }
        if (num3 > max) {
            max = num3;
        } else if (num3 < min) {
            min = num3;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + "; ");
        }

        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр");
        int srcNumber = 1234;
        int sumDigits = 0;
        System.out.print("\tРеверсивное число: ");
        while (srcNumber != 0) {
            int digit = srcNumber % 10;
            sumDigits += digit;
            srcNumber /= 10;
            System.out.print(digit);
        }

        System.out.println("\n\n4. Вывод чисел на консоль в несколько строк");
        int counter = 0;
        for (int i = 1; i < 24; i += 2) {
            counter++;
            System.out.printf("%5d", i);
            if (counter == 5) {
                System.out.println();
                counter = 0;
            }
        }
        if (counter != 0) {
            for (; 5 - counter > 0; counter++) {
                System.out.printf("%5d", 0);
            }
        }

        System.out.println("\n\n5. Проверка количества двоек на четность");
        int num = 3242592;
        int numDeuces = 0;
        int numTmp = num;
        while (numTmp != 0) {
            int digit = numTmp % 10;
            numTmp /= 10;
            if (digit == 1) {
                numDeuces++;
            }
        }
        if (numDeuces % 2 == 0) {
            System.out.println("Число " + num + " содержит четное количество единиц");
        } else {
            System.out.println("Число " + num + " содержит нечетное количество единиц");
        }

        System.out.println("\n\n6.Отображение фигур в консоли");
        int countLines;
        int countSymbols;
        for (countLines = 1; countLines <= 5; countLines++) {
            for (countSymbols = 1; countSymbols <= 10; countSymbols++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();
        countLines = 5;
        while (countLines != 0) {
            countSymbols = countLines;
            while (countSymbols != 0) {
                countSymbols--;
                System.out.print('#');
            }
            countLines--;
            System.out.println();
        }

        System.out.println();
        boolean midle = false;
        int midleRow = 3;
        int curIndex;
        countLines = 1;
        do {
            curIndex = countLines;
            do {
                System.out.print('$');
                curIndex--;
            } while (curIndex != 0);
            System.out.println();
            if (countLines == midleRow) {
                midle = true;
            }
            if (!midle) {
                countLines++;
            } else {
                countLines--;
            }
        } while (countLines != 0);

        System.out.println("\n7.Отображение ASCII-символов");
        System.out.printf(" %4s %4s \n ", "DEC", "CHAR");
        for (int i = 1; i <= 47; i++) {
            if (i % 2 != 0) {
                System.out.printf(" %3d %4s \n ", i, (char) i);
            }
        }
        for (int i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf(" %3d %4s \n ", i, (char) i);
            }
        }

        System.out.println("\n8.Проверка, является ли число палиндромом");
        srcNumber = 1234321;
        int copySrcNumber = srcNumber;
        int reversedNumber = 0;
        do {
            reversedNumber += copySrcNumber % 10;
            copySrcNumber /= 10;
            if (copySrcNumber > 0) {
               reversedNumber *= 10;
            }
        } while (copySrcNumber > 0);
        if (reversedNumber == srcNumber) {
            System.out.printf("число %d палиндром", reversedNumber);
        } else {
            System.out.printf("число %d не палиндром", reversedNumber);
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        int luckyNumber = 167851;
        int copyLuckyNumber = luckyNumber;
        int countDigits = 0;
        int sumHalfPartNumber = 0;
        int sumMinorPartNumber = 0;
        int midle10 = 1;
        while (copyLuckyNumber > 0) {
            copyLuckyNumber /= 10;
            countDigits++;
        }
        copyLuckyNumber = luckyNumber;
        for (int i = 1; i <= countDigits; i++) {
            int digit = copyLuckyNumber % 10;
            copyLuckyNumber /= 10;
            if (i <= countDigits / 2) {
                sumMinorPartNumber += digit;
                midle10 *= 10;
            } else {
                sumHalfPartNumber += digit;
            }
        }
        int luckyPart1 = luckyNumber / midle10;
        int luckyPart2 = luckyNumber % midle10;
        System.out.printf("\tСумма цифр %d = %d", luckyPart1, sumHalfPartNumber);
        System.out.printf("\n\tСумма цифр %d = %d", luckyPart2, sumMinorPartNumber);
        if (sumMinorPartNumber == sumHalfPartNumber) {
            System.out.printf("\nчисло %d счастливое", luckyNumber);
        } else {
            System.out.printf("\nчисло %d несчастливое", luckyNumber);
        }

        System.out.println("\n\n10.Таблица Пифагора");
        for (int i = 1; i < 10; i++) {
            if (i != 1) {
                System.out.printf("%3d", i);
            } else {
                System.out.printf(" %3s", " |");
            }
        }
        System.out.println();
        for (int i = 1; i < 10; i++) {
                  System.out.printf("%s", "---");
        }
        for (int i = 2; i < 10; i++) {
            System.out.println();
            for (int k = 1; k < 10; k++) {
                if (i * k != 1) {
                    System.out.printf("%3d", i * k);
                } else {
                    System.out.printf("%3s", "");
                }
                if (k == 1) {
                    System.out.print("|");
                }
            }
        }

    }
}