package java_8;

public class UseCalculatiion {
	public static void main (String[] args) {
		Calculation add = (x,y)->x+y;//lambda expression 
		System.out.println(add.find(50,30));
		add.progress();
		System.out.println(Calculation.name());
	}

}
