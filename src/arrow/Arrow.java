package arrow;

import java.util.ArrayList;
import java.util.Collection;

import line.Line;

import display.Display;

public abstract class Arrow {
	
	public Collection<Line> head;

	public Arrow() {
		this.head = new ArrayList<Line>();
	}

	public void accept(Display display) {
		display.visitArrow(this);
	}
}
