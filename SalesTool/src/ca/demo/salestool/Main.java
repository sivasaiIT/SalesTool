package ca.demo.salestool;

public class Main {

	public static void main(String[] args) {
		SalesData data=new SalesData();
		
		displayGreetings();
		data.display();

	}
	private static void displayGreetings() {
		System.out.println("Hello Happy Sales People!");
		System.out.println("This App Shows Sales Data.");
		System.out.println("--------------------------");
		System.out.println("Test1");
		System.out.println("Test2");
	}

}
