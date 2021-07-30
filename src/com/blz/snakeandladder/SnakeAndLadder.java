package com.blz.snakeandladder;

public class SnakeAndLadder {
	public int rollDice() {
		int randValue = (int) (Math.random() * 10) % 6 + 1;
		return randValue;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SnakeAndLadder ch = new SnakeAndLadder();
		int currentPosition = 0;
		do {
			int randOption = (int) (Math.random() * 10) % 3 + 1;
			int rollDice;
			System.out.println(randOption);
			switch (randOption) {
			case 1:
				System.out.println("No Play");
				break;
			case 2:
				System.out.println("In Ladder");
				rollDice = ch.rollDice();
				currentPosition += rollDice;
				break;
			case 3:
				System.out.println("In Snake");
				rollDice = ch.rollDice();
				currentPosition -= rollDice;
				break;
			default:
				System.out.println("Erro In randOption");
			}
			System.out.println("Current Position : " + currentPosition);

		} while (currentPosition <= 50);

	}
}
