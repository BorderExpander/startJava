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
        guessNum = (int) Math.floor(Math.random() * 100);
        while (true) {
            if (tryToGuess(player1)) {
                break;
            }
            if (tryToGuess(player2)) {
                break;
            }
        }
    }

    private boolean tryToGuess(Player player) {
        player.setNumber(scan.nextInt());
        if (player.getNumber() == guessNum) {
            System.out.println("Игрок " + player.getName() + " победил! Загаданное число: " 
                    + guessNum);
            return true;
        } else if (player.getNumber() > guessNum) {
            System.out.println("Число " + player.getNumber() + " больше того, что загадал компьютер");
        } else if (player.getNumber() < guessNum) {
            System.out.println("Число " + player.getNumber() + " меньше того, что загадал компьютер");
        }
        return false;
    }
}