/**
 * 
 */
package Visitor_Pattern;

/**
 * @author zainmaqsood, irfanraziuddin
 *
 */
public class Mouse implements ComputerPart{

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);		
	}

}
