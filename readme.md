[![](https://ya.se/wp-content/uploads/2020/11/ya-logo-blue-bg.svg)](https://ya.se)
## Group Assignment #1:
## Tic Tac Toe

**Objective:**
> create a simplified version of the game that can be play directly in IDE (Eclipse)

**Student:** [Mohamad Ojail](https://github.com/MohamadOjail "Mohamad Ojail")

------------


Included in solution:

- [x] Handel the data in a 2D Array.
- [x] Player vs computer.
	- [x] take user input.
	- [x] use random function for computer move.
- [x] Multiple play-rounds.
- [x] Check for win and keep count.
- [ ] Levels of hardness.

------------

#### new technique learned:
**Rotate Array: example done by me:**

```java
String[][] board = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };

for (int i = 0; i < board.length; i++) {
	for (int j = 0; j < board[i].length; j++) {
		System.out.print(board[i][j] + "\t");
	}
	System.out.println();
}
System.out.println();

String[] items = new String[board.length * board[0].length];
for (int i = 0, x = 0; i < board.length; i++) {
	for (int j = 0; j < board[i].length; j++, x++) {
		items[x] = board[i][j];
	}
}
for (int j = 0; j < items.length; j++) {
	System.out.print(items[j] + "  ");
}
System.out.println("\n");

String[][] tempBoard = new String[board.length][board[0].length];

for (int i = 0, x = items.length - 3; i < tempBoard.length; i++, x++) {
	for (int j = 0; j < tempBoard[i].length; j++) {
		tempBoard[i][j] = items[x - (tempBoard.length * j)];
	}
}

for (int i = 0; i < tempBoard.length; i++) {
	for (int j = 0; j < tempBoard[i].length; j++) {
		System.out.print(tempBoard[i][j] + "\t");
	}
	System.out.println();
}
```