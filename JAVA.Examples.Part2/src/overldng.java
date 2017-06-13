
public class overldng {
	
	public void m1(){
		System.out.println("hi im first");
	}
	protected void m1(String string){
		System.out.println("hi im second");
	}
	private float m1(int i){
		System.out.println("hi im third");
		return 3.43f;
	}
	int m1(String str1, int g){
		System.out.println("hi im fourth combination");
		return 10;
	}
	public static void main (String args[]){
		overldng obj = new overldng();
		obj.m1();
		obj.m1(10);
		obj.m1("hello");
		obj.m1("hi", 10);
	}

}
