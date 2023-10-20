  package java_8;
import java.util.Optional;
public class OptSample {
	public static void main (String[] args) {
		String a = "mugesh";
//		Optional<String> check = Optional.of(a);//optional class of() showing nullpointer exception
		Optional<String> check = Optional.ofNullable(a);
		if(check.isEmpty()) {//isPresent and isEmpty boolean
			System.out.println(a);
		}
		else {
			System.out.println("the value is empty");
		}
//		Optional<String> check = Optional.of(a);
//		System.out.println(check.get());//no such element exception
		System.out.println(check.orElse("this is nothing"));
//		System.out.println(check.orElseThrow(()->new NullPointerException()));//null pointer exception
		
	}

}
