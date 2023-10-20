package java_8;

public interface Furniture {
	public void getName();
	public static String getWarranty(boolean isWarranty) {
		if(isWarranty==true) {
		return "6months";
		}
		else {
			return "0 months";
		}
	}
	public default void getPrice(int price) {
		System.out.println(price);
	}

}
