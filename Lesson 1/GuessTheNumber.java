public class GuessTheNumber {

    public static void main(String[] args) {
        int guessNum = 49;
        int suggestedNum = 0;
        int counter = 0;

        while (suggestedNum != guessNum) {
            counter++;
            suggestedNum = suggestedNum + (counter % 10);
            if (suggestedNum < 1) {
                suggestedNum = (counter % 10) + 1;
            } else if (suggestedNum > 100) {
                suggestedNum = 0;
            }
            if (suggestedNum > guessNum) {
                System.out.println("Число " + suggestedNum + " больше того, что загадал компьютер");
            } else if (suggestedNum < guessNum) {
                System.out.println("Число " + suggestedNum + " меньше того, что загадал компьютер");
            }
        }

        System.out.println("Вы победили! Загаданное число: " + guessNum);
    }
}