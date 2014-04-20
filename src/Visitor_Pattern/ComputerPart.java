/**
 * 
 */
package Visitor_Pattern;

/**
 * @author zainmaqsood, irfanraziuddin
 *
 */
public interface ComputerPart {

	public void accept(ComputerPartVisitor computerPartVisitor);
}
