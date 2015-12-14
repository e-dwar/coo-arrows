package display;

import line.DashedLine;
import line.DottedLine;
import line.PlainLine;

public class Java2DDisplay implements Display {

	protected Java2DCanvas display;

	public Java2DDisplay() {
		this.display = new Java2DCanvas();
	}

	public void visitPlainLine(PlainLine line) {
		display.j2dDrawLine(line.vertexA, line.vertexB, false, false);
	}

	public void visitDottedLine(DottedLine line) {
		display.j2dDrawLine(line.vertexA, line.vertexB, true, false);
	}

	public void visitDashedLine(DashedLine line) {
		display.j2dDrawLine(line.vertexA, line.vertexB, false, true);
	}
}
