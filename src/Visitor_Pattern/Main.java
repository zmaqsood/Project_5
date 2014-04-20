/**
 * 
 */
package Visitor_Pattern;

/**
 * @author zainmaqsood, irfanraziuddin
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConcreteComputerPartVisitor concreteVisitor = new ConcreteComputerPartVisitor();
		Computer computer = new Computer();
		computer.accept(concreteVisitor);
		
	}

}
