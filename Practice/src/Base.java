
public class Base {
	
	public void methodPublic(){
		System.out.println("Base public");
	}
	public int methodPublic2(){
		System.out.println("Base int public");
		return 5;
	}
	protected String methodPro1(){
		System.out.println("Base string protected");
		return "hello";
	}
	Base methodDef(){
		System.out.println("Base Default");
		return null;
	}
	public static void main (String args[]){
		Base  object = new Base();
		object.methodPublic();
	}
}
