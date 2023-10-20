package Exception2;

public class Demo5 {
	public static void main (String[] args) throws AgeException {//throws exception in next of method block
		String name = "mugesh";
		int age = 17;
//		try {
		if(age>=18) {
			System.out.println("Welcomee "+name);
		}
		else {
			throw new AgeException("Not Valid");
		}
//		}
//		catch(AgeException ae) {
//			System.out.println(ae);
//		}
	}

}
