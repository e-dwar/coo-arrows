package display;

import java.awt.Point;

public class Java2DCanvas {
    /**
     * Draw a line between the points 'p1' and 'p2'. The line will be dotted if
     * and only if 'dotted' is true. The line will be dashed if and only if
     * 'dashed' is true. If both 'dotted' and 'dashed' are true, the result is
     * unspecified.
     */
    public void j2dDrawLine(Point p1, Point p2, boolean dotted, boolean dashed) {
        String out = "\nJava2DCanvas:\n";
        out += "  dotted = " + dotted + ",\n";
        out += "  dashed = " + dashed + ",\n";
        out += "  (" + p1.x + ", " + p1.y + "), ";
        out += "(" + p2.x + ", " + p2.y + ").";
        System.out.println(out);
    }
}