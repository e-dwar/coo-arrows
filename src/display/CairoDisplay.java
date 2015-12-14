package display;

import line.*;

public class CairoDisplay extends Display {

    protected CairoCanvas display;

    public CairoDisplay() {
        this.display = new CairoCanvas();
    }

    @Override
    public void visitPlainLine(PlainLine line) {
        display.printStraight(line.vertexA, line.vertexB, CairoCanvas.LineType.PLAIN);
    }

    @Override
    public void visitDottedLine(DottedLine line) {
        display.printStraight(line.vertexA, line.vertexB, CairoCanvas.LineType.DOTTED);
    }

    @Override
    public void visitDashedLine(DashedLine line) {
        display.printStraight(line.vertexA, line.vertexB, CairoCanvas.LineType.DASHED);
    }
}
