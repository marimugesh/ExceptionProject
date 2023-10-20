package Exception2;
//Single Try Multi Catch
public class Demo8 {
	public static void main (String[] args) {
		String a = "mugi";
		try {
			System.out.println(a.charAt(8));
		}
		catch(ArithmeticException ae) {
			System.out.println("invalid value");
		}
		catch(NullPointerException ne) {
			System.out.println("found nullpointer exp");
		}
		catch(NumberFormatException num) {
			System.out.println("found num format exp");
		}
		catch(StringIndexOutOfBoundsException se) {
			System.out.println("found String index out of bound exp ");
		}
		catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("found Array index out of bound exp");
		}
		catch(Exception e) {
			System.out.println("Exception Handled");
		}
	}

}
