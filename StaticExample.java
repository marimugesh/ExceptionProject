package java_8;

public class StaticExample {
	static int counter = 0;
	public StaticExample() {
		counter++;
		System.out.println(counter);
	}
	static {//static block is executed only once before the main method
		System.out.println("This is Static");
	}

}
