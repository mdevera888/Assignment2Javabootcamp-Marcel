import java.util.Random;
import java.util.Scanner;

public class Assignment2Marcel {
	
			public static void main (String[] args) {
				
				
				Random random = new Random();
				int randomNumber = random.nextInt(100) + 1;
				
				Scanner scanner = new Scanner(System.in);
				boolean hasWon = false;
				int numGuesses = 0;
				
				int numberToGuess = randomNumber;
				while (numGuesses < 5) {
					System.out.print("Pick a number between 1 and 100: ");
					int userGuess = scanner.nextInt();
					
					if (userGuess < 1 || userGuess > 100) {
						System.out.println("Your guess is not between 1 and 100, please try again");
					} else if (userGuess < numberToGuess) {
						System.out.println("Please pick a higher number");
						numGuesses++;
					} else if (userGuess > numberToGuess) {
						System.out.println("Please pick a lower number");
						numGuesses++;
					} else {
						hasWon = true;
						break;
					}
					
				}
				if (hasWon) {
					System.out.println("You win!");
				} else {
					System.out.println("You lose!");
					System.out.println("The number to guess was: " + numberToGuess);
				}
				scanner.close();
			}
	}



