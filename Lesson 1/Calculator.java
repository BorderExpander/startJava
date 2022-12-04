public class Calculator {

    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        int result = 0;
        char sign = '*';
        boolean mistake = false;

        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign =='*') {
            result = a * b;
        } else if (sign == '/') {
            if (b == 0) {
                mistake = true;
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
                mistake = true;
            } else {
                result = a % b;
            }
        }
        if (mistake == true) {
            System.out.println("Ошибка");
        } else {
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }
    }
}