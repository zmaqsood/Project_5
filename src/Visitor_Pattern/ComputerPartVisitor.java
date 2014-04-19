/**
 * 
 */
package Visitor_Pattern;

/**
 * @author zainmaqsood
 *
 */
public interface ComputerPartVisitor {

	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
	public void visit(Computer computer);
}
