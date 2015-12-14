package line;

import java.awt.Point;

import display.Display;

public abstract class Line {

	public Point vertexA;
	public Point vertexB;

	public abstract void accept(Display display);

	public Line(Point vertexA, Point vertexB) {
		this.vertexA = vertexA;
		this.vertexB = vertexB;
	}
}
