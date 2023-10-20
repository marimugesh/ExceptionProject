package java_8;
@FunctionalInterface
public interface Calculation {
	public int find(int a, int b);
	public static String name() {
		return "Addition";
	}
	public default void progress() {
		System.out.println("Arithmatic Operation");
	}

}
