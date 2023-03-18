package com.bridgelabz.snakeandladderproblem;

/* The Player rolls the die to get a number between 1 to 6. 
  Use ((RANDOM)) to get the number between 1 to 6 */

public class SnakeAndLadderSimulator {

	public static void main(String[] args) {
		
		int startPosition = 0;
		
		int diceValue = (int) (Math.floor(Math.random() * 10) % 6) + 1;
		System.out.println("The player get dice value as: " + diceValue);
	}
}
