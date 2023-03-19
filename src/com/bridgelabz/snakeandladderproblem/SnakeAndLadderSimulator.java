package com.bridgelabz.snakeandladderproblem;

/* Report the number of times the dice was played to win the game
and also the position after every die role */

public class SnakeAndLadderSimulator {
	
	public static void main(String[] args) {
		
		int startPosition = 0;
		int currentPosition = 0;
		int finalPosition = 100;
		int noOfRolls = 0;
		
		currentPosition = startPosition;
		while(currentPosition < finalPosition) {
			
			//Generates value between 1 to 6 for die
			int diceValue = (int) (Math.floor(Math.random() * 10) % 6) + 1;
			System.out.println("The player get dice value as: " + diceValue);
			noOfRolls++;
		
			//Generates value 0,1 & 2 for checking the condition of no play, ladder and snake
			int option = (int) (Math.floor(Math.random() * 10) % 3);
			System.out.println("Option: " +option);
        
			/*In Case of No Play the player stays in the same position
			 * - In Case of Ladder the player moves ahead by the number of position received in the die
			 * - In Case of Snake the player moves behind by the
			 * - In case the player position go above 100, the player stays in the same previous position till the player gets the exact */
			if(option == 0) {
				System.out.println("No play");
				currentPosition += 0;
			} else if(option == 1) {
				System.out.println("Ladder");
				currentPosition += diceValue;
				if(currentPosition > 100 ) {
					currentPosition -= diceValue;
				}
			} else {
				System.out.println("Snake");
				currentPosition -= diceValue;
				if(currentPosition < 0) {
					currentPosition = startPosition;
				}
			}
			System.out.println("Current Position: " +currentPosition);
		}
		System.out.println("Number Of total Dice rolls are: " + noOfRolls);
	}
}