package Exception2;

public class Demo4 {
	public static void main (String[] args) {
//		String a = "Mugesh";
		int[] num = {1,2,3,4,5};
		
//		System.out.println(a.charAt(8));//StriingIndex OutofBound Exp Occurs
		try {
//		System.out.println(a.charAt(8));
		System.out.println(num[8]);//ArrayIndex Out of Bound
		}
		catch(StringIndexOutOfBoundsException e) {
//			System.out.println(e);//exp handled but blue link will show
			System.out.println("Array/String Index Out of Bound Exception Handled");//Exp Handled
		}
		finally {
			System.out.println("Can't get the Index");
		}
	}

}
