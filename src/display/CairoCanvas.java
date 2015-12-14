package display;

import java.awt.Point;

public class CairoCanvas {
	/**
	 * Draw a line between points 'p1' and 'p2'. The kind of line is specified
	 * by the 'type' parameter.
	 */
	public void printStraight(Point p1, Point p2, LineType type) {
		String out = "\nCairoCanvas:\n";
		out += "  " + type + ", ";
		out += "(" + p1.x + ", " + p1.y + "), ";
		out += "(" + p2.x + ", " + p2.y + ").";
		System.out.println(out);
	}

	enum LineType {
		PLAIN, DASHED, DOTTED
	}
}