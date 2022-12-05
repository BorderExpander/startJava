public class Calculator {

    private static int firstNumber;
    private static int secondNumber;
    private static char sign;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
    public void setSign(char sign) {
        this.sign = sign;
    }

    public static void calculate() {
        boolean wrong = false;
        int result = 0;
        switch(sign) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber == 0) {
                    wrong = true;
                } else {
                    result =  firstNumber / secondNumber;
                }
                break;
            case '^':
                result = 1;
                for (int i = secondNumber; i != 0; i--) {
                    result *= firstNumber;
                }
                break;
            case '%':
                if (secondNumber == 0) {
                    wrong = true;
                } else {
                    result = firstNumber % secondNumber;
                }
                break;
        }
        if (wrong) {
            System.out.println("Ошибка");
        } else {
            System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + result);
        }
    }
}