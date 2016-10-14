package javabook.ch5;

public class SmartTV extends Product {
	String resolution;
	
	public SmartTV(String pname, int price, String resolution){
		this.pname = pname;
		this.price = price;
		this.resolution = resolution;
	}
	
	public void printExtra(){
		System.out.println("ÇØ»óµµ: "+ resolution);
	}
}
