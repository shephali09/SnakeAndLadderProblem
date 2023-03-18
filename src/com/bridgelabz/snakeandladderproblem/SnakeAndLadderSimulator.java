package com.bridgelabz.snakeandladderproblem;

/* The Player then checks for a Option. They are No Play, Ladder or Snake. 
   Use ((RANDOM)) to check for Options */

public class SnakeAndLadderSimulator {

	public static void main(String[] args) {
		
		int startPosition = 0, currentPosition = 0;
		
		//Generates value between 1 to 6 for die
		int diceValue = (int) (Math.floor(Math.random() * 10) % 6) + 1;
		System.out.println("The player get dice value as: " + diceValue);
		
		//Generates value 0,1 & 2 for checking the condition of no play, ladder and snake
		int option = (int) (Math.floor(Math.random() * 10) % 3);
		System.out.println("Option: " +option);
        
		/*In Case of No Play the player stays in the same position
  		* - In Case of Ladder the player moves ahead by the number of position received in the die
        * - In Case of Snake the player moves behind by the */
		if(option == 0) {
		System.out.println("No play");
		currentPosition += 0;
		} else if(option == 1) {
			System.out.println("Ladder");
			currentPosition += diceValue;
		} else {
			System.out.println("Snake");
			currentPosition -= diceValue;
			if(currentPosition < 0) {
				currentPosition = startPosition;
			}
		}
		System.out.println("Current Position: " +currentPosition);
	}
}
