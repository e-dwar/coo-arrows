package display;

import line.*;

public class CairoDisplay extends Display {

	protected CairoCanvas display;

	public CairoDisplay() {
		this.display = new CairoCanvas();
	}

	public void visitPlainLine(PlainLine line) {
		display.printStraight(line.vertexA, line.vertexB, CairoCanvas.LineType.PLAIN);
	}

	public void visitDottedLine(DottedLine line) {
		display.printStraight(line.vertexA, line.vertexB, CairoCanvas.LineType.DOTTED);
	}

	public void visitDashedLine(DashedLine line) {
		display.printStraight(line.vertexA, line.vertexB, CairoCanvas.LineType.DASHED);
	}
}
