package java_8;

public class MyElectronics implements Electronics {
	public String status(boolean a) {
		if(a==true) {
			return "working";
		}
		else {
			return "not working";
		}
	}
	public void price(int price) {
		System.out.println(price + 500);
	}

}
