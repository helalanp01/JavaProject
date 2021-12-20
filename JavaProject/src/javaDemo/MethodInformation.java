package javaDemo;

public class MethodInformation {
	
	

	public static void main(String[] args) {
		MethodInformation scanOne=new MethodInformation();
		scanOne.infoOne();
		scanOne.info();
		scanOne.noInfo();
		scanOne.withInClass();
		khata();
		scanOne.khata();
		MethodInformation.khata();
		
		
		
		
		

	}
	private void infoOne() {
		System.out.println("private->within same class only");
	}
	
	public void info() 
	{
		System.out.println("public->within class + within package + outside too");
	}
	void noInfo() {
		System.out.println("default/no modifier-> within package");
	}
	protected void withInClass() {
		System.out.println("protected-> within class + within package");
	}
	public static void khata() {
		System.out.println("its a static method");
		
	}
	

}
