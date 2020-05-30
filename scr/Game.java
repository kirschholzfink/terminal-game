package TerminalGame;

import java.util.Random;

public class Game {

	private Level level;

	public Game() {
		int width = (int)(Math.floor(Math.random() * (15 -10 +1) +10));
		int height = (int)(Math.floor(Math.random() * (15 -10 +1) +10));
		

		do {
		level = new Level(width, height);
		addWalls();
		} while (!level.existsPathfromAtoB(level.getStart(), level.getTarget()));
		
	}
	
	private void addWalls() {
		for (Field f : level) {
			if (f != level.getStart() && f != level.getTarget()) {
				Random random = new Random();
				int i = random.nextInt(3);
				if (i == 2) {
				f.markAsWall();
				}
			 }
	    }
	
	}

	public void startGame() {
		level.spawnEntities();
		System.out.println("Start:");
		System.out.println(level);
		int i = 1;
		while(level.getPlayer().getField() != level.getTarget()) {
			level.updateEntities();
			System.out.println("Step " + i);
			i++;
			System.out.println(level);
		}
		System.out.println("Player has won the game!");
	}

}
