package javabook.ch5;

public class CellPhone extends Product{
	String carrier;
	
	public CellPhone(String pname, int price, String carrier){
		this.pname = pname;
		this.price = price;
		this.carrier = carrier;
	}
	
	public void printExtra(){
		System.out.println("ÃÑ½Å»ç: " + carrier);
	}
}
