package m3105.trivia.uglytrivia;

import java.util.Random;

import m3105.trivia.runner.Game;

public class GameRunner {

	private static boolean notAWinner;

	public static void main(String[] args) {

		Random rand = new Random();

		Game aGame = new Game();

		aGame.add("Chet");
		aGame.add("Pat");
		aGame.add("Sue");

		do {

			aGame.roll(rand.nextInt(5) + 1);

			if (rand.nextInt(9) == 7) {
				notAWinner = aGame.wrongAnswer();
			} else {
				notAWinner = aGame.wasCorrectlyAnswered();
			}

		} while (notAWinner);

	}
}