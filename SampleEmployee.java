package java_8;

public class SampleEmployee {
	private String name;
	private int sal;
	private int exp;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public SampleEmployee(String name, int sal, int exp) {
		super();
		this.name = name;
		this.sal = sal;
		this.exp = exp;
	}
	@Override
	public String toString() {
		return name+" "+sal+" "+exp;
	}
	
//	public void maxi(List<SampleEmployee> ab) {
//		int max = ab[0];
//		for(int i=0; i<ab.length; i++) {
//			if(max<ab[i]) {
//				max = ab[i];
//			}
//		}
//	}
}
