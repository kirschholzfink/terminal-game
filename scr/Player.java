package TerminalGame;

import java.util.*;

public class Player implements MovableObject {

	private int x;
	private int y;
	private Level level;
	private List<Field> findPath;
	
	public Player(int x, int y, Level level) {
		this.x = x;
		this.y = y;
		this.level = level;
		
		this.findPath = new ArrayList<Field>(level.findPathfromAtoB(level.getStart(), level.getTarget()));
		
	}
	
	public Field getField() {
		return level.getField(x, y);
	}

	@Override 
	public String toString() {
		return "P";
	}

	public void respawnPlayer() {
		System.out.println("Player died!");
		level.getField(this.x, this.y).setMovableObject(null);
		this.x = level.getStart().getX();
		this.y = level.getStart().getY();
		level.getStart().setMovableObject(this);
				
	}
	
	@Override
	public void moveToNextField() {
		Field currentField = new Field(this.x, this.y);
		if (!currentField.equals(level.getTarget())) {
			for (int i = 0; i < findPath.size() - 1; i++) {
				if (findPath.get(i).getX() == this.x && findPath.get(i).getY() == this.y) {
					if ((findPath.get(i+1).getMovableObject() instanceof Enemy)) {
						respawnPlayer();
					} else {
						findPath.get(i).setMovableObject(null);
						this.x = findPath.get(i+1).getX();
						this.y = findPath.get(i+1).getY();
						findPath.get(i+1).setMovableObject(this);
					}
					break;	
		            }
				}
		   }
	  }
}
