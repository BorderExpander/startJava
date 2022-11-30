public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на Java");
        int age = 25;
        boolean male = true;
        float height = 1.9f;
        String name = "Vladislav";
        if (age > 20) {
            System.out.println("Возраст больше 20 лет");
        } else {
            System.out.println("Возраст меньше 21 лет");
        }

        if (!male) {
            System.out.println("Женский пол");
        } else {
            System.out.println("Мужской пол");
        }

        if (height < 1.80) {
            System.out.println("Рост меньше 180 см");
        } else {
            System.out.println("Рост больше 179 см");
        }

        char firstLetter = name.charAt(0);
        if (firstLetter == 'M') {
            System.out.println("Первая буква имени M");
        } else if (firstLetter == 'I') {
            System.out.println("Первая буква имени I");
        } else {
            System.out.println("Первая буква имени " + firstLetter); 
        }

        System.out.println("\n2.Поиск max и min числа");
        int num1 = 256;
        int num2 = 4096;
        if (num1 > num2) {
            System.out.println("Максимальное число " + num1 + " " + "минимальное число " + num2);
        } else if (num1 < num2) {
            System.out.println("Максимальное число " + num2 + " " + "минимальное число " + num1);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3.Работа с числом");
        int srcNum = 345;
        if (srcNum != 0) {
            if (srcNum % 2 == 0) {
                System.out.print("Число " + srcNum + " четное,");
            } else {
                System.out.print("Число " + srcNum + " нечетное,");
            }
            if (srcNum < 0) {
                System.out.print(" отрицательное");
            } else {
                System.out.print(" положительное");
            }
        } else {
            System.out.println("Число равно 0");
        }

        System.out.println("\n\n4.Поиск одинаковых цифр в числах");
        int srcNum1 = 500;
        int srcNum2 = 150;
        System.out.println("Исходные числа: " + srcNum1 + " и " + srcNum2);
        boolean similarDigits = false;

        if (srcNum1 / 100 == srcNum2 / 100) {
            System.out.println("Разряд 1  число " + srcNum1 / 100);
            similarDigits = true;
        }
        if (srcNum1 % 100 / 10 == srcNum2 % 100 / 10) {
            System.out.println("Разряд 2 число " + (srcNum1 % 100) / 10);
            similarDigits = true;
        }
        if (srcNum1 % 10 == srcNum2 % 10) {
            System.out.println("Разряд 3 число " + srcNum2 % 10);
            similarDigits = true;
        }
        if (!similarDigits) {
            System.out.println("Одинаковых цифр нет");
        }

        System.out.println("\n5.Определение буквы, числа или символа по их коду");
        char someChar = '\u0057';
        if (someChar >= '0' && someChar <= '9') {
            System.out.println(someChar + " - число"); 
        } else if (someChar >= 'A' && someChar <= 'Z') {
            System.out.println(someChar + " - большая буква"); 
        } else if (someChar >= 'a' && someChar <= 'z') {
            System.out.println(someChar + " - маленькая буква"); 
        } else {
            System.out.println(someChar + " - не буква и не число"); 
        }

        System.out.println("\n6.Определение суммы вклада и начисленных банком %");
        double deposit = 300_000.00;
        int percent = 5;
        if (deposit >= 100_000 && deposit <= 300_000) {
            percent = 7;
        } else if (deposit > 300_000) {
            percent = 10;
        }
        double sumPercent = deposit * percent / 100;
        System.out.println("Сумма вклада: \t\t" + deposit);
        System.out.println("Начисленный %: \t\t" + sumPercent);
        System.out.println("Итого с %: \t\t" + (deposit + sumPercent));

        System.out.println("\n7.Определение оценки по предметам");
        byte percentHistory = 59;
        byte percentProgramming = 91;
        byte scoreHistory = 2;
        byte scoreProgramming = 2;
        if (percentHistory > 60 && percentHistory <= 73) {
            scoreHistory = 3;
            System.out.println("История 3");
        } else if (percentHistory > 73 && percentHistory <= 91) {
            scoreHistory = 4;
            System.out.println("История 4");
        } else if (percentHistory > 91) {
            scoreHistory = 5;
            System.out.println("История 5");
        }
        if (percentProgramming > 60 && percentProgramming <= 73) {
            scoreProgramming = 3;
            System.out.println("Программирование 3");
        } else if (percentProgramming > 73 && percentProgramming <= 91) {
            scoreProgramming = 4;
            System.out.println("Программирование 4");
        } else if (percentProgramming > 91) {
            scoreProgramming = 5;
            System.out.println("Программирование 5");
        }
        int percentAverage = (percentProgramming + percentHistory) / 2;
        System.out.println("Средний процент " + percentAverage + "%");
        int scoreAverage = (scoreProgramming + scoreHistory) / 2;
        System.out.println("Средний балл " + scoreAverage);

        System.out.println("\n8.Расчет прибыли");
        int arendPerMonth = 5000;
        int salePerMonth = 13000;
        int netCost = 9000;
        int yearProfit = (salePerMonth - arendPerMonth - netCost) * 12;
        if (yearProfit > 0) {
            System.out.println("Прибыль за год: +" + yearProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + yearProfit + " руб.");
        }

        System.out.println("\n9.Подсчет количества банкнот");
        int sumTotal = 567;
        int numOf100 = sumTotal / 100;
        int numOf10 = (sumTotal - numOf100 * 100) / 10;
        int numOf1 = sumTotal % 10;
        int limitOf100 = 10;
        int limitOf10 = 5;
        int limitOf1 = 50;
        //System.out.println("Для суммы " + sumTotal + " необходимо:" + numOf100 + " купюр по 100, "
        //        + numOf10 + " купюр по 10, " + numOf1 + " купюр по 1");
        if (numOf100 > limitOf100) {
            numOf10 += (numOf100 - limitOf100) * 100;
            numOf100 = limitOf100;
        }
        if (numOf10 > limitOf10) {
            numOf1 += (numOf10 - limitOf10) * 10;
            numOf10 = limitOf10;
        }
        if (numOf1 > limitOf1) {
            System.out.println("Недостаточно купюр для выдачи");
        } else {
            System.out.println("Для суммы " + sumTotal + " выбрано:" + "\t" + numOf100 + 
                " купюр по 100," + numOf10 + " купюр по 10, " + numOf1 + " купюр по 1");
            sumTotal = numOf100 * 100 + numOf10 * 10 + numOf1;
            System.out.println("Проверка суммы: " + sumTotal);
        }
    }
}