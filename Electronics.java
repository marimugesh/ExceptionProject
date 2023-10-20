package java_8;

public interface Electronics {
	public String status(boolean a);
	public static String name() {
		return "mobile";
	}
	public default void price(int price) {
		System.out.println(price);
	}

}
