package game.tools;

public class CheckWin {
	
	Stats stats = new Stats();
	
	public static boolean checkWin(String[][] board) {
		int countX = 0, countO = 0;
		
		// kolla rader för vinnst
		
		for (int i = 0; i < board.length; i++) {
			countX = 0; countO = 0;
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j].equals("X"))
					countX++;
				if (board[i][j].equals("O"))
					countO++;
			}
			if (countX == 3)
				System.out.println("Du vann!");
			if (countO == 3)
				System.out.println("Datorn vinner!");
			if (countX == 3 || countO == 3){
				if (countX == 3) {
					Stats.updateStats(0);
				}else {
					Stats.updateStats(1);
				}
				return true;}
		}

		countX = 0; countO = 0;
		// kolla diagnalt för vinnst
		
		for (int i = 0; i < board.length; i++) {
			for (int j = i; j < board[i].length; j++) {
				if (board[i][j].equals("X"))
					countX++;
				if (board[i][j].equals("O"))
					countO++;
			}
			if (countX == 3)
				System.out.println("Du vann!");
			if (countO == 3)
				System.out.println("Datorn vinner!");
			if (countX == 3 || countO == 3){
				if (countX == 3) {
					Stats.updateStats(0);
				}else {
					Stats.updateStats(1);
				}
				return true;}
		}

		countX = 0; countO = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 2; j >= 0; j--) {
				if (board[i][j].equals("X"))
					countX++;
				if (board[i][j].equals("O"))
					countO++;
			}
			if (countX == 3)
				System.out.println("Du vann!");
			if (countO == 3)
				System.out.println("Datorn vinner!");
			if (countX == 3 || countO == 3){
				if (countX == 3) {
					Stats.updateStats(0);
				}else {
					Stats.updateStats(1);
				}
				return true;}
		}
		
		// kolla kolumner för visst
		// rotera arrayn

		 int size = board.length;
		 String[][] tempBoard = new String[size][size];

		 for (int i = 0; i < size; ++i) 
		  for (int j = 0; j < size; ++j) 
		   tempBoard[i][j] = board[size - j - 1][i];

		countX = 0; countO = 0;

		for (int i = 0; i < tempBoard.length; i++) {
			countX = 0; countO = 0;
			for (int j = 0; j < tempBoard[i].length; j++) {
				if (tempBoard[i][j].equals("X"))
					countX++;
				if (tempBoard[i][j].equals("O"))
					countO++;
			}
			if (countX == 3)
				System.out.println("Du vann!");
			if (countO == 3)
				System.out.println("Datorn vinner!");
			if (countX == 3 || countO == 3){
				if (countX == 3) {
					Stats.updateStats(0);
				}else {
					Stats.updateStats(1);
				}
				return true;}
		}

		return false;
	}
	
	
}
