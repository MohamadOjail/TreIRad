package game.tools;

public class PrintOut {

	GameLogic logic;

	public PrintOut(GameLogic gameLogic) {
		logic = gameLogic;
	}

	public void printBoard(String[][] board) {
		
		String print = "";
		System.out.println("\n");
		
		for (int i = 0; i < board.length; i++) {

			System.out.print("\t");

			for (int j = 0; j < 2; j++) {
				System.out.print("   |  ");
			}

			System.out.println();
			System.out.print("\t");

			for (int j = 0; j < board[i].length; j++) {
				print = (j < 2) ? board[i][j] + "  |  " : board[i][j];
				System.out.print(print);
			}

			System.out.println();
			System.out.print("\t");

			for (int j = 0; j < 2; j++) {
				System.out.print("   |  ");
			}

			System.out.println();
			System.out.print("    ");

			for (int j = 0; j < board[i].length; j++) {
				if (i < 2)
					System.out.print("-------");
			}

			System.out.println();
		}
		System.out.println("\n");
	}
}
