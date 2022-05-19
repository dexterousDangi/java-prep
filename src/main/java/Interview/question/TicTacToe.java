package Interview.question;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {

		// we need a gird of character to play with , so we use a char 2-d array

		char[][] board = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };

		// now we need to display it like a real board with lines and can able to enter
		// the values as well
		Scanner scanner = new Scanner(System.in);
		printBoard(board);
		System.out.println("Palyer represent - X");
		System.out.println("computer represent - O");
		// take user input

		while (true) {
			palyerTurn(board, scanner);
			if (isGameFinished(board)) {
				break;
			}
			printBoard(board);
			computerTurn(board);
			if (isGameFinished(board)) {
				break;
			}

			printBoard(board);
		}
	}

	private static boolean isGameFinished(char[][] board) {

		if (hasWinner(board, 'X')) {
			printBoard(board);
			System.out.println("palyer wins !!");
			return true;
		}

		if (hasWinner(board, 'O')) {
			printBoard(board);
			System.out.println("computer wins !!");
			return true;
		}

		for (char c[] : board) {
			for (char cc : c) {
				if (cc == ' ') {
					return false;
				}
			}
		}
		printBoard(board);
		System.out.println("the game ended in a tie...");
		return true;

	}

	private static boolean hasWinner(char[][] board, char symbol) {
		if ((board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol)
				|| (board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol)
				|| (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol)

				|| (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol)
				|| (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol)
				|| (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol)

				|| (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol)
				|| (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {

			return true;
		}
		return false;
	}

	private static void computerTurn(char[][] board) {
		// now how to take the input form computer
		Random rand = new Random();
		// ( here 9 means between 0 to 8 so to make it between 1 to 9 we use
		int computerMove; // "+1")
		while (true) {
			computerMove = rand.nextInt(9) + 1;
			if (isValidMove(board, Integer.toString(computerMove))) {
				break;
			}
		}
		System.out.println("computer chose : " + computerMove);
		placeMove(board, Integer.toString(computerMove), 'O');
		// what if this place is already taken by the player then, add a check method
		// for both palyer and computer

	}

	private static boolean isValidMove(char[][] board, String postion) {
		switch (postion) {
		case "1":
			return (board[0][0] == ' ');

		case "2":
			return (board[0][1] == ' ');

		case "3":
			return (board[0][2] == ' ');

		case "4":
			return (board[1][0] == ' ');
		case "5":
			return (board[1][1] == ' ');

		case "6":
			return (board[1][2] == ' ');

		case "7":
			return (board[2][0] == ' ');

		case "8":
			return (board[2][1] == ' ');

		case "9":
			return (board[2][2] == ' ');

		default:
			return false;
		}
	}

	private static void palyerTurn(char[][] board, Scanner scanner) {
		String userInput;
		while (true) {
			System.out.println("where do you want to play? (1-9)");
			userInput = scanner.nextLine();
			// so to switch the user input value with the board reference we are going to
			// use a switch statement usage
			if (isValidMove(board, userInput)) {
				break;
			} else {
				System.out.println(userInput + " : is not a valid move...");
			}
		}
		placeMove(board, userInput, 'X');

	}

	private static void placeMove(char[][] board, String position, char symbol) {
		switch (position) {
		case "1":
			board[0][0] = symbol;

			break;
		case "2":
			board[0][1] = symbol;

			break;
		case "3":
			board[0][2] = symbol;

			break;
		case "4":
			board[1][0] = symbol;

			break;
		case "5":
			board[1][1] = symbol;

			break;
		case "6":
			board[1][2] = symbol;

			break;
		case "7":
			board[2][0] = symbol;

			break;
		case "8":
			board[2][1] = symbol;

			break;
		case "9":
			board[2][2] = symbol;

			break;
		default:
			System.out.println("enter the correct index");
		}
	}

	private static void printBoard(char[][] board) {
		System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("-+-+-");
		System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("-+-+-");
		System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
	}

}
