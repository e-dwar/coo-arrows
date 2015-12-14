package line;

import java.awt.Point;

import display.Display;

public class DottedLine extends Line {

    public DottedLine(Point vertexA, Point vertexB) {
        super(vertexA, vertexB);
    }

    @Override
    public void accept(Display display) {
        display.visitDottedLine(this);
    }
}
