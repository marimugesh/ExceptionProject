package Exception2;

public class Demo6 {
	public static void main (String[] args) throws GmailException {
		String name = "Mugesh";
		String uName = "mugesh@gmail.com";
		String pWord = "1234567890";
		
		if(uName.equalsIgnoreCase("mugesh@gmail.com") && pWord.equalsIgnoreCase("123456789")) {
			System.out.println("Welcome to Gmail "+name);
		}
		else {
			throw new GmailException("Entered Invalid Password...TryAgain");
		}
	}

}
