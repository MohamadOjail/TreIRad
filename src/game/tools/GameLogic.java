package game.tools;

import java.util.Scanner;

public class GameLogic {

	String[][] board;
	int[] coords;

	public GameLogic() {

		board = new String[3][3];
		coords = new int[2];
	}

	PrintOut print = new PrintOut();
	TakeInput input = new TakeInput(this);

	public void run() {
		MSG.welcome(50);
		
		play();
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Spela igen? (j, n):");
			if(sc.nextLine().equals("j")) play();
			else {
				MSG.lastGame(board);
				MSG.printStats();
				sc.close();
				System.exit(0);
			}
		}
	}

	private void play() {
		
		initBoard();
		print.printBoard(board);
		
		boolean winner = false;
		
		int playerId = 0, moveCount = 0; // 0 player 1 dator

		while (!winner && moveCount <= 9) {
			TakeInput.playMove(playerId);
			updateBoard(playerId);
			print.printBoard(board);
			playerId = (playerId == 0) ? 1 : 0;
			winner = CheckWin.checkWin(board);
			moveCount++;
			if(moveCount > 8 && !winner)System.out.println("ingen vinnare");
		}
	}

	private void updateBoard(int playerId) {
		int x = coords[0], y = coords[1];
		if (playerId == 0) board[x][y] = "X";
		if (playerId == 1) board[x][y] = "O";
	}

	private void initBoard() {
		for (int i = 0, x = 1; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++, x++) {
				board[i][j] = "" + x;
			}
		}
	}
}
