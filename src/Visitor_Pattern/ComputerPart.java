/**
 * 
 */
package Visitor_Pattern;

/**
 * @author zainmaqsood
 *
 */
public interface ComputerPart {

	public void accept(ComputerPartVisitor computerPartVisitor);
}
