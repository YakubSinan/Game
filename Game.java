package game;
 
import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		/*
		 * Scanner s = new Scanner(System.in); Random rnd = new Random();
		 * System.out.println(rnd.nextInt()); //-2^32 2^32
		 * 
		 * for (int i = 0; i < 20; i++) {
		 * 
		 * System.out.println(rnd.nextInt(9)+1); //1-9 }
		 */

	

		System.out.println("Lets play a game");
		System.out.println("First you go!");

		while (true) {
			String user = userMove();
			if(user.equals("exit"))
				break;
			String comp = computerMove();
			System.out.println("Computer picks: " + comp);
			if (user.equals(comp))
				System.out.println("Its a tie!");
			else if (user.equals("rock") && comp.equals("paper"))
				System.out.println("Computer wins");
			else if (user.equals("paper") && comp.equals("scissors"))
				System.out.println("Computer wins");
			else if (user.equals("scissors") && comp.equals("rock"))
				System.out.println("Computer wins");
			else
				System.out.println("You win!");
		}
		System.out.println("game over");
	}

	public static String userMove() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your move or type exit to terminate");
//		String input = s.next();
//		return input;
		return s.next();
	}

	public static String computerMove() {
		// 0 - rock
		// 1- paper
		// 2 - scissors
		Random r = new Random();
		int move = r.nextInt(3);// 0-1-2

		switch (move) {
		case 0:
			return "rock";
		case 1:
			return "paper";
		default:
			return "scissors";
		}


	}

}

