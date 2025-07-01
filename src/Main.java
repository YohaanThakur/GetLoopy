import java.util.Random;
import java.util.Scanner;

class DieRollar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String playAgain;

        do {
            int rollCount = 0;
            int die1, die2, die3;

            System.out.println("Roll\tDie1\tDie2\tDie3\tSum");
            System.out.println("---------------------------------------");

            while (true) {
                rollCount++;
                die1 = rand.nextInt(6) + 1;
                die2 = rand.nextInt(6) + 1;
                die3 = rand.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%4d\t%4d\t%4d\t%4d\t%4d\n",
                        rollCount, die1, die2, die3, sum);

                if (die1 == die2 && die2 == die3) {
                    break;
                }
            }

            System.out.print("\nRoll again? (y/n): ");
            playAgain = scanner.nextLine().trim().toLowerCase();
        } while (playAgain.equals("y"));

        scanner.close();
    }
}
