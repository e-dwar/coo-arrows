package gui;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collection;

import arrow.TriangularArrow;

import line.*;

import display.*;

public class GUI {

	public static void main(String[] args) {
		GUI gui = new GUI();
		CairoDisplay cairo = new CairoDisplay();
		Java2DDisplay java2d = new Java2DDisplay();
		TriangularArrow arrow = new TriangularArrow();
		ArrayList<Line> lines = new ArrayList<Line>();
		lines.add(new PlainLine(new Point(0, 0), new Point(10, 0)));
		lines.add(new DottedLine(new Point(0, 10), new Point(10, 10)));
		lines.add(new DashedLine(new Point(0, 20), new Point(10, 20)));
		gui.drawLines(lines, cairo);
		gui.drawLines(lines, java2d);
		System.out.println("\ntriangular arrow");
		System.out.println("----------------");
		arrow.accept(cairo);
		System.out.println("\ntriangular arrow");
		System.out.println("----------------");
		arrow.accept(java2d);
	}

	public void drawLines(Collection<Line> lines, Display display) {
		for (Line line : lines) {
			line.accept(display);
		}
	}
}