package java_8;

public class UseMyElectronics {
	public static void main (String[] args) {
		MyElectronics e = new MyElectronics();
		e.price(700);//default can be overrided. have to create object for default
		System.out.println(Electronics.name());//no need to create object for static method 
	}

}
