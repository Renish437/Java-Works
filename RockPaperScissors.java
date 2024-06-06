import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println("Enter 0 for Rock 1 for paper and 2 for Sccissor");
        Scanner sc = new Scanner(System.in);
        int userinput = sc.nextInt();
        Random random = new Random();
        int computerchoice = random.nextInt(3);

        if (userinput == computerchoice) {
            System.out.println("Draw");
        } else if (userinput == 0 && computerchoice == 2 || userinput == 1 && computerchoice == 0 || userinput == 2 && computerchoice == 1) {
            System.out.println("You win");
        } else {
            System.out.println("Computer wins");
        }
        System.out.println("Computer entered"+" " + computerchoice);

    }
    }

