package org.phone;

public class InternalStorage {
	public void processorName() {
		// TODO Auto-generated method stub
System.out.println("processor Name Is Omg");
	}
	public void ramSize() {
		// TODO Auto-generated method stub
System.out.println("ram Size Is Zero");
	}
	public static void main(String[] args) {
		InternalStorage in = new InternalStorage();
		in.processorName();
		in.ramSize();
		
		ExternalStorage ex = new ExternalStorage();
		ex.size();
	}
}
