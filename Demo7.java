package Exception2;

public class Demo7 {
	public void a() {//StackOverFlow
		b();
	}
	public void b() {
		a();
	}

}
