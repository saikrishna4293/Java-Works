
public class Constructor extends Constructor2 {

	
	Constructor(){
		super('c');
		System.out.println("hi im in child class");
	}
	
	public void method(){
		System.out.println("im object class method");
	}
	
	public static void main(String[] args) {
		System.out.println("how are you");
		Constructor obj = new Constructor();
		obj.method();
	}

}
