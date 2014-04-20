/**
 * 
 */
package Visitor_Pattern;

/**
 * @author zainmaqsood, irfanraziuddin
 *
 */
public class ConcreteComputerPartVisitor implements ComputerPartVisitor{

	@Override
	public void visit(Mouse mouse) {
		System.out.println("This is Mouse");		
	}

	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("This is Keyboard");
	}

	@Override
	public void visit(Monitor monitor) {
		System.out.println("This is Monitor");
	}

	@Override
	public void visit(Computer computer) {
		System.out.println("This is Computer");
	}

}
