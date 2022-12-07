import java.util.Scanner;

public class GuessNumber {

    private int guessNum;
    private Player player1;
    private Player player2;
    private Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        guessNum = (int) (1 + (Math.random() * 100));
        while (true) {
            if ( (isGuessed(player1)) || (isGuessed(player2)) ) {
                break;
            }
        }
    }

    private boolean isGuessed(Player player) {
        inputNum(player);
        int num = player.getNum();
        if (num == guessNum) {
            System.out.println("Игрок " + player.getName() + " победил! Загаданное число: " + guessNum);
            return true;
        } else if (num > guessNum) {
            System.out.println("Число " + player.getNum() + " больше того, что загадал компьютер");
        } else if (num < guessNum) {
            System.out.println("Число " + player.getNum() + " меньше того, что загадал компьютер");
        }
        return false;
    }

    private void inputNum(Player player) {
        System.out.println("Игрок " + player.getName() + " введите число:");
        player.setNum(scan.nextInt());
    }
}