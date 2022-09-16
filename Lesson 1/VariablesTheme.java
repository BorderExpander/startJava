public class VariablesTheme {
	public static void main(String[] args) {

	System.out.println("1. Создание переменных и вывод их значений на консоль");
	boolean isTrue = true;
	byte processor = 4;
	short ramMemory = 8;
	int systemType = 64;
	long productId = 00252;
	float someFloat= 5.5f;
	double someDouble= 6.6d;
	System.out.println("Булево значение " + isTrue);
	System.out.println("Количество ядер " + processor);
	System.out.println("Оперативной памяти, ГБ " + ramMemory);
	System.out.println("Разрядность системы " + systemType);
	System.out.println("Какое-то число F " + someFloat);
	System.out.println("Какое-то число D " + someDouble);

	System.out.println("\n2. Расчет стоимости товара со скидкой");
	double summaSkidki = (100 + 200) * 0.11;
	System.out.println("Сумма скидки составляет: " + summaSkidki);
	int resultSum = (100 + 200) - (int) summaSkidki;
	System.out.println("Сумма со скидкой: " + resultSum);

	System.out.println("\n3. Вывод на консоль слова JAVA");
	System.out.println("   J    a  v     v  a   ");
	System.out.println("   J   a a  v   v  a a  ");
	System.out.println("J  J  aaaaa  V V  aaaaa ");
	System.out.println(" JJ  a     a  V  a     a");

	System.out.println("\n4. Отображение min и max значений числовых типов данных");
	byte byteVar = 127;
	short shortVar = 32767;
	int intVar = 2_147_483_647;
	long longVar = 9_223_372_036_854_775_807l;
	System.out.println(byteVar);
	System.out.println(byteVar + 1);
	System.out.println(byteVar - 1);
	System.out.println(shortVar);
	System.out.println(shortVar + 1);
	System.out.println(shortVar - 1);
	System.out.println(intVar);
	System.out.println(intVar + 1);
	System.out.println(intVar - 1);
	System.out.println(longVar);
	System.out.println(longVar + 1);
	System.out.println(longVar - 1);

	/*System.out.println("\nПерестановка значений переменных");
	System.out.println("замена с помощью третьей переменной");
	int var1 = 2;
	int var2 = 5;
	int var3 = 0;
	System.out.println("Исходное значение var1: " + var1);
	System.out.println("Исходное значение var2: " + var2);
	System.out.println("исходное значение var3: " + var3);
	var3 = var1;
	var1 = var2;
	var2 = var3;
	var3 = 0;
	System.out.println("Новое значение var1: " + var1);
	System.out.println("Новое значение var2: " + var2);
	System.out.println("Новое значение var3: " + var3);
	System.out.println("замена с помощью арифметических операций");
	System.out.println("Исходное значение var1: " + var1);
	System.out.println("Исходное значение var2: " + var2);
	System.out.println("исходное значение var3: " + var3);
	var3 += var1;
	var1 += var2;
	var2 += var3;
	var3 = 0;
	System.out.println("Новое значение var1: " + var1);
	System.out.println("Новое значение var2: " + var2);
	System.out.println("Новое значение var3: " + var3);*/

	System.out.println("\n5. Перестановка значений переменных");
	int var1 = 2;
	int var2 = 5;
	int var3 = (byte)var1;
	System.out.println("\tИсходное значение: var1 = " + var1 + " var2 = " + var2);
	System.out.println("\t\t перестановка с помощью третьей переменной: var1 = " + var2 + " var2 = " + var1);
	System.out.println("\tИсходное значение: var1 = " + var2 + " var2 = " + var1);
	var1 = var2 - 3;
	var2 = var3 + 3;
	System.out.println("\t\t с помощью арифметических операций: var1 = " + var1 + " var2 = " + var2);
	System.out.println("\tИсходное значение: var1 = " + var1 + " var2 = " + var2);
	var2 ^= 7;
	var1 ^= 7;
	System.out.println("\t\t с помощью побитовой операции: var1 = " + var1 + " var2= " + var2);

	System.out.println("6. Вывод символов и их кодов");
	int[] arrayASCII = new int[]{35, 38, 64, 94, 95};
	int[] var30 = arrayASCII;
	int var31 = arrayASCII.length;

	for(int var32 = 0; var32 < var31; ++var32) {
	int j = var30[var32];
	System.out.println("\t Код " + j + " символ " + (char)j);
		}

	System.out.println("\n7.Отображение количества сотен, десятков и единиц числа");
	int num = 123;
	System.out.println("\tКоличество сотен в числе " + num / 100);
	System.out.println("\tКоличество десятков в числе " + num / 10 % 10);
	System.out.println("\tКоличество единиц в числе " + num % 10);

	System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
	char constSlash = '/';
	char constReverseSlash = '\\';
	char constLine = '_';
	char constBracket = '(';
	char constReverseBracket = ')';
	char constSpace = ' ';

	char[] firstLine = new char[]{constSpace, constSpace, constSpace, constSpace, constSlash, constReverseSlash,
	constSpace, constSpace, constSpace, constSpace};
	System.out.println(firstLine);
	char[] secondLine = new char[]{constSpace, constSpace, constSpace, constSlash, constSpace, constSpace, 
	constReverseSlash, constSpace, constSpace, constSpace};
	System.out.println(secondLine);
	char[] thirdLine = new char[]{constSpace, constSpace, constSlash, constLine, constBracket, constSpace, constReverseBracket,
	constReverseSlash};
	System.out.println(thirdLine);
	char[] fourthLine = new char[]{constSpace, constSlash, constSpace, constSpace, constSpace, constSpace, constSpace, constSpace,
	constReverseSlash};
	System.out.println(fourthLine);
	char[] fifthLine = new char[]{constSlash, constLine, constLine, constLine, constLine, constSlash, constReverseSlash, constLine,
	constLine, constReverseSlash};
	System.out.println(fifthLine);

	System.out.println("\n9. Произведение и сумма цифр числа");
	int valNum = 345;
	int valSum = valNum / 100 + valNum % 10 + ( valNum % 100 ) / 10;
	int valProduct = (valNum / 100) * (valNum % 10) * (( valNum % 100 ) / 10);
	System.out.printf("Сумма цифр числа %s = %s", valNum, valSum);
	System.out.printf("\nПроизведение цифр числа %s = %s", valNum, valProduct);

	System.out.println("\n\n10. Преобразование секунд");
	int numSeconds = 86399;
	int hh = numSeconds / 3600;
	int minutes = numSeconds % 3600 / 60;
	int seconds = numSeconds % 3600 % 60;
	System.out.printf("полученное время %s:%s:%s", hh, minutes, seconds);
	}
}