package java_8;

public class UseStudent {
	public static void main (String[] args) {
		Student.schoolName = "SRM";
		Student s1 = new Student();
		s1.name = "mugesh";
		s1.age = 15;
		Student s2 = new Student();
		s2.name = "priya";
		s2.age = 17;
		System.out.println(s1+"\n"+s2);
	}

}
