package game.tools;

import java.util.Random;
import java.util.Scanner;

public class TakeInput {
	static GameLogic logic;
	static Scanner sc;
	public TakeInput(GameLogic gameLogic) {

		logic = gameLogic;
		sc = new Scanner(System.in);
	}

	public static void playMove(int id) {
		if (id == 0) user();
		if (id == 1) dator();
	}

	private static void setCoords(String input) {
		boolean found = false;
		while (!found) {
			for(int i = 0; i < logic.board.length; i++) {
					for(int j = 0; j < logic.board[i].length; j++) {
						if(logic.board[i][j].equals(input)) {
							found = true;
							logic.coords[0] = i;
							logic.coords[1] = j;
						}
					}
				}
			if(found) break;
			System.out.println("Ogiltigt val försök igen");
			input = getInput();
		}
	}

	private static void dator() {
		Random rnd = new Random();
		int x = rnd.nextInt(3);
		int y = rnd.nextInt(3);	
		
		while(logic.board[x][y].equals("X") || logic.board[x][y].equals("O")) {
			
			x = rnd.nextInt(3);
			y = rnd.nextInt(3);	
		}
		logic.coords[0] = x;
		logic.coords[1] = y;
	}

	private static void user() {
		String input = getInput();
		setCoords(input);
	}

	private static String getInput() {
		System.out.println("Välj en ruta: ");
		String output = "";
		boolean valid = false;
		while (!valid) {
			try {
				output = "" + sc.nextInt();
				valid = true;
			} catch (Exception e) {
				System.out.println("Ogiltigt val försök igen");
				sc.next();
			}
		}

		return output;
	}

}

