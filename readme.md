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
**Rotate Array:**
```java
int size = board.length;
		 String[][] tempBoard = new String[size][size];

		 for (int i = 0; i < size; ++i) 
		  for (int j = 0; j < size; ++j) 
		   tempBoard[i][j] = board[size - j - 1][i];
```
