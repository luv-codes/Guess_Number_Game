import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                int number = (int)(Math.random() * 101);
                int random = 0 ;
                int attempt = 1;
                while (random != number) {
                    System.out.println("Enter your guess number: ");
                    random = input.nextInt();
                    if (random < number) {
                        System.out.println("Wrong guess. Your guessed number is too low.");
                        System.out.println("Try Again");
                        attempt++;
                    }
                    else if (random > number) {
                        System.out.println("Wrong guess. Your guessed number is too high.");
                        System.out.println("Try Again");
                        attempt++;
                        System.out.println("Total number of attempts " + attempt);
                    } else
                        System.out.println("You guessed the correct number!");
                }
            }
        }