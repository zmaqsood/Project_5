/**
 * 
 */
package Visitor_Pattern;

/**
 * @author zainmaqsood, irfanraziuddin
 *
 */
public class Keyboard implements ComputerPart{

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}

	

}
