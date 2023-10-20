package java_8;

public class Max {
	public int maxi(int[] ab) {
		int max = ab[0];
		for(int i=0; i<ab.length; i++) {
			if(max<ab[i]) {
				max = ab[i];
			}
		}
		return max;
	}
	
	public static int min(int[] b) {
		int min = b[0];
		for(int x : b) {
			if(x<min) {
				min = x;
			}
		}
		return min;
	}

}
