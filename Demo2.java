package Exception2;
//NullPointerException
public class Demo2 {
	public static void main (String[] args) {
		System.out.println("Hi");
		String a = null;
		try {
		System.out.println(a.toUpperCase());//NullPointerException
		}
		catch(Exception e) {
			System.out.println("Can't convert a null into uppercase");//Exception handled
		}
		System.out.println("Bye");
	}

}
