package pppd;

public class ModifiersUsage {

	final int i= 100;
	static int b =300;
	final int c;
	
	ModifiersUsage(){
		
		c = 400;
		System.out.println(c);
	}
	public void method1(){
		int i=10;
		System.out.println("local variable "+i);
	}
	
	protected void method3(){
		int b= 100;
		System.out.println("protected variable "+b);
	}
	
	private void method2(){
		System.out.println("im private");
	}
	void method4(){
		System.out.println("im default");
	}
	
	public static void main(String[] args) {
		ModifiersUsage object1 = new ModifiersUsage();
		object1.method1();
		object1.method2();
		System.out.println(b);
		
		ModifiersUsage object2 = new ModifiersUsage();
		System.out.println(object2.b);
		System.out.println(object2.i);
		object1.b = 111;
		System.out.println("after modify static ob1  "+object1.b);
		System.out.println("after modify static ob2  "+object2.b);	
		object1.method4();
		
		hello ob = new hello();
		ob.method();
	}
}
class hello{
	void method(){
		System.out.println("hello class");
	}
	
}
