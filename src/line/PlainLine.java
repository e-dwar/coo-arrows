package line;

import java.awt.Point;

import display.Display;

public class PlainLine extends Line {

    public PlainLine(Point vertexA, Point vertexB) {
        super(vertexA, vertexB);
    }

    @Override
    public void accept(Display display) {
        display.visitPlainLine(this);
    }
}
