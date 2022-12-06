public class Calculator {

    private static int num1;
    private static int num2;
    private static char sign;

    public void setnum1(int num1) {
        this.num1 = num1;
    }
    
    public void setnum2(int num2) {
        this.num2 = num2;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public static void calculate() {
        boolean wrong = false;
        int result = 0;
        switch(sign) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    wrong = true;
                } else {
                    result =  num1 / num2;
                }
                break;
            case '^':
                result = 1;
                for (int i = num2; i != 0; i--) {
                    result *= num1;
                }
                break;
            case '%':
                if (num2 == 0) {
                    wrong = true;
                } else {
                    result = num1 % num2;
                }
                break;
        }
        if (wrong) {
            System.out.println("Ошибка");
        } else {
            System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
        }
    }
}