package display;

import line.DashedLine;
import line.DottedLine;
import line.PlainLine;

public interface Display {

	public void visitPlainLine(PlainLine line);

	public void visitDottedLine(DottedLine line);

	public void visitDashedLine(DashedLine line);
}
