package display;

import arrow.Arrow;
import line.DashedLine;
import line.DottedLine;
import line.Line;
import line.PlainLine;

public abstract class Display {

	public abstract void visitPlainLine(PlainLine line);

	public abstract void visitDottedLine(DottedLine line);

	public abstract void visitDashedLine(DashedLine line);

	public void visitArrow(Arrow arrow) {
		for (Line line : arrow.head) {
			line.accept(this);
		}
	}
}
