package line;

import java.awt.Point;

import display.Display;

public class DashedLine extends Line {

	public DashedLine(Point vertexA, Point vertexB) {
		super(vertexA, vertexB);
	}

	@Override
	public void accept(Display display) {
		display.visitDashedLine(this);
	}
}
