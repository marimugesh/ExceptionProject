package java_8;

import java.util.ArrayList;
import java.util.List;

public class UseSampleEmployee {
	public static void main (String[] args) {
		SampleEmployee s1 = new SampleEmployee("mugesh",28000,2);
		SampleEmployee s2 = new SampleEmployee("priya",26000,1);
		SampleEmployee s3 = new SampleEmployee("mari",19000,0);
		SampleEmployee s4 = new SampleEmployee("kutty",18000,2);
		SampleEmployee s5 = new SampleEmployee("mugi",25000,3);
		SampleEmployee s6 = new SampleEmployee("dharshini",23000,1);
		
		List<SampleEmployee> emp = new ArrayList<>();
		emp.add(s1);
		emp.add(s2);
		emp.add(s3);
		emp.add(s4);
		emp.add(s5);
		emp.add(s6);
		
		
	}

}
