package arrow;

import java.awt.Point;

import line.PlainLine;

public class TriangularArrow extends Arrow {

	public TriangularArrow() {
		super();
		this.head.add(new PlainLine(new Point(5, 10), new Point(5, 20)));
		this.head.add(new PlainLine(new Point(0, 0), new Point(10, 10)));
		this.head.add(new PlainLine(new Point(0, 0), new Point(-10, 10)));
		this.head.add(new PlainLine(new Point(-10, 10), new Point(10, 10)));
	}
}
