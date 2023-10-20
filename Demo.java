package Exception2;
//ArithmaticException
public class Demo {
	public static void main (String[] args) {
//		System.out.println("ViratKohli");
//		int a = 10;
//		int b = 0;
//		System.out.println(a/b); //Exception  occurs
//		System.out.println("Bye");
		
		System.out.println("ViratKohli");
		int a = 10;
		int b = 0;
		try {
		System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println("Can't Divide a Number by 0");//Exception handled
//			System.out.println(e);//java.lang.ArithmeticException/by zero
//			e.printStackTrace();
		}
		System.out.println("Bye");
		
	}

}
