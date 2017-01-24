package TestPack;

/**
 * This is a traditional game in its rudimentary form("With no GUI*).
 * Rock Paper and Scissors involves you selecting either of the elements and then the computer randomly generates either of the element .
 * Created by Biose Nonso Emmanuel on 8|1|2017.
 */

//Importing neccesary classes
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	
	//Declaring and initialising class fields
	private static Scanner scanner = new Scanner(System.in);
	private static Random random = new Random();
	private static boolean exitGame = false;
	private static int option;
	public static void main(String[] args) {
		
		//Calls the menu options
		menu();
		
		//Loop that keeps the program running until condition is false
		while(exitGame == false) {		
			
			//Accepts input from user for play options
			option = scanner.nextInt();
			scanner.nextLine();
			
			//Switch case here serves as the game options
			switch(option) {
			case 0: 
				System.out.println("GAME OVER");
				exitGame = true;
				break;
			case 1:
				menu();
				break;
			case 2:
				playGame();
				break;
			}
		}
		
	}
	
	//Prints to screen the menu options
	public static void menu() {
		System.out.println("Please select any option below:");
		System.out.println("\t -0- To exit");
		System.out.println("\t -1- To print play options");
		System.out.println("\t -2- To play game");
	}
	
	//Randomly generated numbers are stored and used to return the computers decision either Rock Paper or Scissors
	private static String computerChoice() {
		for(int i = 0; i < 3; i++) {
			int compChoice = 1 + random.nextInt(3);
			if(compChoice == 1) {
				return "ROCK";
			} else if(compChoice == 2) {
				return "PAPER";
			} else if(compChoice == 3) {
				return "SCISSORS";
			} 
		}
		return null;
	}
	
	//Takes in the users input selection and compares it with that of computer to determine the result
	public static void playGame() {
		System.out.println("Please input any of the following: ROCK == PAPER == SCISSORS");
		String comp = computerChoice();
		String playerChoice = scanner.nextLine();
		
		if(comp.equalsIgnoreCase(playerChoice)) {
			System.out.println("Computer choice is: " + "==" + comp+ "==");
			System.out.println("RESULT IS A TIE");
			System.out.println("Press 1 for menu");
			System.out.println("Press 2 to play again");
		} else if (comp.equalsIgnoreCase("ROCK") && playerChoice.equalsIgnoreCase("PAPER")) {
			System.out.println("Computer choice was: " + "==" + comp+ "==");
			System.out.println("PAPER wins by wrapping ROCK");
			System.out.println("Press 1 for menu");
			System.out.println("Press 2 to play again");
		} else if(comp.equalsIgnoreCase("ROCK") && playerChoice.equalsIgnoreCase("SCISSORS")) {
			System.out.println("Computer choice was: " + "==" + comp+ "==");
			System.out.println("ROCK WINS by crushing SCISSORS");
			System.out.println("Press 1 for menu");
			System.out.println("Press 2 to play again");
		} else if(comp.equalsIgnoreCase("PAPER") && playerChoice.equalsIgnoreCase("ROCK")) {
			System.out.println("Computer choice was: " + "==" + comp+ "==");
			System.out.println("PAPER wins by wrapping ROCK");
			System.out.println("Press 1 for menu");
			System.out.println("Press 2 to play again");
		} else if(comp.equalsIgnoreCase("PAPER") && playerChoice.equalsIgnoreCase("SCISSORS")) {
			System.out.println("Computer choice was: " + "==" + comp+ "==");
			System.out.println("SCISSORS WINS by cutting up PAPER");
			System.out.println("Press 1 for menu");
			System.out.println("Press 2 to play again");
		} else if(comp.equalsIgnoreCase("SCISSORS") && playerChoice.equalsIgnoreCase("ROCK")) {
			System.out.println("Computer choice was: " + "==" + comp+ "==");
			System.out.println("ROCK WINS by crushing SCISSORS");
			System.out.println("Press 1 for menu");
			System.out.println("Press 2 to play again");
		} else if(comp.equalsIgnoreCase("SCISSORS") && playerChoice.equalsIgnoreCase("PAPER")) {
			System.out.println("Computer choice was: " + "==" + comp+ "==");
			System.out.println("SCISSORS WINS by cutting up PAPER");
			System.out.println("Press 1 for menu");
			System.out.println("Press 2 to play again");
		} else {
			System.out.println("ERROR . . . . The following may have occured");
			System.out.println("*. Wrong spelling");
			System.out.println("*. Selected menu options inplace of ==Rock==Paper==Scissors");
			System.out.println(". . .  Press 1 to goto menu");
		}
	}
}
