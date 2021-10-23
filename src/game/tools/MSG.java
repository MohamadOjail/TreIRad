package game.tools;

public class MSG {
	
	public static void welcome(int milliSec) {
		System.out.println();
		String welcomeString = "  Välkommen till Tre i rad!";
		for(int i = 0; i < welcomeString.length(); i++) {
			System.out.print(welcomeString.substring(i, i + 1));
			try {
				Thread.sleep(milliSec);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	
	public static void printStats() {
		
		int[] stats = new int[2];
		stats[0] = Stats.getStats()[0];
		stats[1] = Stats.getStats()[1];
		
		String print = "Vinst status:\n" + "Dator: " + stats[1] + "\t-\t" + "Du: " + stats[0];
		System.out.println("================================");
		System.out.println(print);
		System.out.println("================================\n");
		System.out.println("Hejdå");
	}
	
	static PrintOut print = new PrintOut();
	
	public static void lastGame(String[][] board) {
		
		System.out.println("================================\n");
		System.out.println("Sista matchen var:\n");
		System.out.println("================================\n");
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if(!board[i][j].equals("X") && !board[i][j].equals("O"))
				board[i][j] = " ";
			}
		}
		
		print.printBoard(board);
	}
}
