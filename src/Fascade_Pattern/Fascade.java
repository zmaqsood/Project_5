/**
 * 
 */
package Fascade_Pattern;

/**
 * @author zainmaqsood, irfanraziuddin
 *
 */
public class Fascade {

	private CPU processor;
	private Memory ram;
	private HardDrive hd;
	
	public Fascade(){
		this.processor = new CPU();
		this.ram = new Memory();
		this.hd = new HardDrive();
	}
	
	public void start(){
		processor.freeze();
		ram.load();
		processor.jump();
		processor.execute();
		
	}
}
