public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        boolean webCam = true;
        byte cpuFrequency = 2;
        short ramMemoryGB = 8;
        int systemType = 64;
        long productId = 00252;
        float wieghtComputer= 1.4f;
        double screenDisplay= 13.4d;
        System.out.println("\tналичие веб камеры " + webCam);
        System.out.println("\tчастота процессора " + cpuFrequency +"GHz");
        System.out.println("\tоперативная память " + ramMemoryGB +"GB");
        System.out.println("\tКод продукта " + productId);
        System.out.println("\tРазрядность системы " + systemType);
        System.out.println("\tВес компьютера " + wieghtComputer +"кг");
        System.out.println("\tДиагональ экрана" + screenDisplay +"дюймов");

        System.out.println("\n 2. Расчет стоимости товара со скидкой");
        double pricePen = 100.0;
        double priceBook = 200.0;
        short discountPersent = 11;
        double goodsPrice = priceBook + pricePen;
        double discountSum = goodsPrice * discountPersent / 100.0;
        double discountPrice = goodsPrice - discountSum;
        System.out.println("\tСумма скидки: " + discountSum + "\n\t Всего цена со скидкой: " 
                + discountPrice);

        System.out.println("\n3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n 4. Отображение min и max значений числовых типов данных");
        byte byteMax = 127;
        int intMax = Integer.MAX_VALUE;
        short shortMax = 32767;
        long longMax = Long.MAX_VALUE;
        System.out.println("первоначальное значение:");
        System.out.printf("\t %s = %d", Byte.TYPE, byteMax);
        System.out.printf("\n\t %s = %d", Short.TYPE, shortMax);
        System.out.printf("\n\t %s = %d", Integer.TYPE, intMax);
        System.out.printf("\n\t %s = %d", Long.TYPE, longMax);
        System.out.println("\nзначение после инкремента:");
        System.out.printf("\t %s = %d", Byte.TYPE, ++byteMax);
        System.out.printf("\n\t %s = %d", Short.TYPE, ++shortMax);
        System.out.printf("\n\t %s = %d", Integer.TYPE, ++intMax);
        System.out.printf("\n\t %s = %d", Long.TYPE, ++longMax);
        System.out.println("\nзначение после декремента:");
        System.out.printf("\t %s = %d", Byte.TYPE, --byteMax);
        System.out.printf("\n\t %s = %d", Short.TYPE, --shortMax);
        System.out.printf("\n\t %s = %d", Integer.TYPE, --intMax);
        System.out.printf("\n\t %s = %d", Long.TYPE, --longMax);

        System.out.println("\n\n5. Перестановка значений переменных");
        int number1 = 5;
        int number2 = 2;
        System.out.println("\tИсходное значение: var1 = " + number1 + " var2 = " + number2);
        int number3 = number1;
        number1 = number2;
        number2 = number3;
        System.out.println("\t\t перестановка с помощью третьей переменной: var1 = " + number1 
                + " var2 = " + number2);
        System.out.println("\tИсходное значение: var1 = " + number1 + " var2 = " + number2);
        number1 += number2;
        number2 = number1 - number2;
        number1 -= number2;
        System.out.println("\t\t с помощью арифметических операций: var1 = " + number1 + 
                " var2 = " + number2);
        System.out.println("\tИсходное значение: var1 = " + number1 + " var2 = " + number2);
        number1 ^= number2;
        number2 ^= number1;
        number1 ^= number2;
        System.out.println("\t\t с помощью побитовой операции: var1 = " + number1 + " var2= " 
                + number2);

        System.out.println("\n6. Вывод символов и их кодов");
        char code35 = 35;
        char code38 = 38;
        char code64 = 64;
        char code94 = 94;
        char code95 = 95;
        System.out.println("\t Код " + (int) code35 + " символ " + code35);
        System.out.println("\t Код " + (int) code38 + " символ " + code38);
        System.out.println("\t Код " + (int) code64 + " символ " + code64);
        System.out.println("\t Код " + (int) code94 + " символ " + code94);
        System.out.println("\t Код " + (int) code95 + " символ " + code95);

        System.out.println("\n7.Отображение количества сотен, десятков и единиц числа");
        int num = 123;
        System.out.println("\tКоличество сотен в числе " + num / 100);
        System.out.println("\tКоличество десятков в числе " + num / 10 % 10);
        System.out.println("\tКоличество единиц в числе " + num % 10);

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        char space = ' ';
        char slash = '/';
        char backSlash = '\\';
        char underLine = '_';
        char bracket = '(';
        char backBracket = ')';
        System.out.printf("%s%s%s%s%s%s%s%s%s%s", space, space, space, space, slash, backSlash, 
                space, space, space, space);
        System.out.printf("\n%s%s%s%s%s%s%s%s%s%s", space, space, space, slash, space, space, 
                backSlash, space, space, space);
        System.out.printf("\n%s%s%s%s%s%s%s%s%s%s", space, space, slash, underLine, bracket, space, 
                backBracket, backSlash, space, space);
        System.out.printf("\n%s%s%s%s%s%s%s%s%s%s", space, slash, space, space,
                space, space, space, space, backSlash, space);
        System.out.printf("\n%s%s%s%s%s%s%s%s%s%s", slash, underLine, underLine, underLine, 
                underLine, slash, backSlash, underLine, underLine, backSlash);

        System.out.println("\n9. Произведение и сумма цифр числа");
        int srcNum = 345;
        int sumDigits = srcNum / 100 + srcNum % 10 /10 + srcNum % 10;
        int prodDigits = (srcNum / 100) * (srcNum / 10 % 10) * (srcNum % 10);
        System.out.printf("\t сумма цифр числа %d = %d ", srcNum, sumDigits);
        System.out.printf("\n\t произведение цифр числа %d = %d ", srcNum, prodDigits);

        System.out.println("\n\n10. Преобразование секунд");
        int secs = 86399;
        int hh = secs / 3600;
        int mins = secs % 3600 / 60;
        secs = secs % 60;
        System.out.printf("полученное время %s:%s:%s", hh, mins, secs);
    }
}