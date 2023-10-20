package java_8;

public class UseMax {
	public static void main (String[] args) {
		Max m1 = new Max();
		MxMin maxMin = m1::maxi;//method reference (interfaceName varialeName = object:: method)
		int[] num = {1,2,3,5,8,10,18};
		
		System.out.println(maxMin.find(num));
		
		MxMin mini = Max::min;//method reference
		System.out.println(mini.find(num));
		
		
	}

}
