package TerminalGame;

import java.util.Iterator;

public class FieldIterator implements Iterator<Field> {
	
	private Level level;
	private int x;
	private int y;
	
	public FieldIterator (Level level) {
		this.level = level;
		this.x = 0;
		this.y = 0;	
	}
	@Override
	public boolean hasNext() {
		return !(this.y == level.getHeight());
		
	}
	@Override
	public Field next() {
		Field f = level.getField(x , y);
	
		if (x+1 < level.getWidth() && y < this.level.getHeight()) {
			x++;
			return f;
		} 
			x=0;
			y++;
			return f;
		}
	}

 