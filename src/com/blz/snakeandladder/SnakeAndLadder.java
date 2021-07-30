package com.blz.snakeandladder;

public class SnakeAndLadder {
	static final int WINNINGPOSITION = 100;
	static int countDice = 0;
	static SnakeAndLadder ch = new SnakeAndLadder();

	public int rollDice() {
		int randValue = (int) (Math.random() * 10) % 6 + 1;
		return randValue;
	}
	public int randOptionCase(int randOption,int currentPosition) {
		int rollDice;
		switch (randOption) {
		case 1:
			System.out.println("No Play");
			break;
		case 2:
			System.out.println("In Ladder");
			for (int i = 0; i < 2; i++) {
				rollDice = ch.rollDice();
				countDice += 1;
				currentPosition += rollDice;
				if (currentPosition > 100) {
					currentPosition -= rollDice;
				}
			}
			break;
		case 3:
			System.out.println("In Snake");
			rollDice = ch.rollDice();
			countDice += 1;
			currentPosition -= rollDice;
			if (currentPosition < 0) {
				currentPosition = 0;
			}
			break;
		default:
			System.out.println("Erro In randOption");
		}
		return currentPosition;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randOption;
		int currentPositionPlayer1 = 0,currentPositionPlayer2 = 0;
		do {
			randOption = (int) (Math.random() * 10) % 3 + 1;
			currentPositionPlayer1=ch.randOptionCase(randOption, currentPositionPlayer1);
			System.out.println("Current Position Player 1 : " + currentPositionPlayer1);
			
			randOption = (int) (Math.random() * 10) % 3 + 1;
			currentPositionPlayer2=ch.randOptionCase(randOption, currentPositionPlayer2);
			System.out.println("Current Position Player 2 : " + currentPositionPlayer2);

		} while (currentPositionPlayer1!=WINNINGPOSITION && currentPositionPlayer2!=WINNINGPOSITION);
		if (currentPositionPlayer1==100) {
			System.out.println("Player one is won :"+currentPositionPlayer1);
		}
		else if (currentPositionPlayer2==100) {
			System.out.println("Player Secon is won :"+currentPositionPlayer2);
		}
		System.out.println("Total Number of time RollDice : " + countDice);
	}
}
