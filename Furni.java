package java_8;

public class Furni implements Furniture {
	public void getName() {
		System.out.println("TableMate");
	}
	public void getPrice(int price) {
		System.out.println(price+500);
	}
	public String getWarranty(boolean isWarranty) { //static cannot be overrided
		if(isWarranty) {
		return "8months";
		}
		else {
			return "10months";
		}
	}

}
