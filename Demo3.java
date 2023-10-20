package Exception2;

public class Demo3 {
	public static void main (String[] args) {
		System.out.println("Hi");
		String num = "TN72";
		try {
			int a = Integer.parseInt(num);
			System.out.println(a);
		}
//		catch(Exception e){//exp handled
//			System.out.println("hiii");
//		}
		finally {
			System.out.println("This is an Important Message");//execute the imp msg whether exp handled or not
		}
		System.out.println("Bye");
	}

}
