package display;

import line.DashedLine;
import line.DottedLine;
import line.PlainLine;

public class Java2DDisplay extends Display {

    protected Java2DCanvas display;

    public Java2DDisplay() {
        this.display = new Java2DCanvas();
    }

    @Override
    public void visitPlainLine(PlainLine line) {
        display.j2dDrawLine(line.vertexA, line.vertexB, false, false);
    }

    @Override
    public void visitDottedLine(DottedLine line) {
        display.j2dDrawLine(line.vertexA, line.vertexB, true, false);
    }

    @Override
    public void visitDashedLine(DashedLine line) {
        display.j2dDrawLine(line.vertexA, line.vertexB, false, true);
    }
}
