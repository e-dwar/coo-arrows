package gui;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collection;

import line.*;

import display.*;

public class GUI {

	public static void main(String[] args) {
		CairoDisplay cairo = new CairoDisplay();
		Java2DDisplay java2d = new Java2DDisplay();
		GUI gui = new GUI();
		ArrayList<Line> lines = new ArrayList<Line>();
		lines.add(new PlainLine(new Point(0, 0), new Point(10, 0)));
		lines.add(new DottedLine(new Point(0, 10), new Point(10, 10)));
		lines.add(new DashedLine(new Point(0, 20), new Point(10, 20)));
		gui.drawLines(lines, cairo);
		gui.drawLines(lines, java2d);
	}

	public void drawLines(Collection<Line> lines, Display display) {
		for (Line line : lines) {
			line.accept(display);
		}
	}
}