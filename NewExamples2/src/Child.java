
public class Child extends Base {
	
	//@override
	public void methodPublic(){
		System.out.println("child public");
	}
	public int methodPublic2(int a, int b){
		System.out.println("child int public");
		return 6;
	}
	//@override
	public String methodPro1(){
		System.out.println("child string pro");
		return "hii";
	}
	//@override
	Base methodDef(){
		System.out.println("child default");
		return null;
	}
	
	public static void main (String args[]){
		Child obj = new Child();
		obj.methodPublic();
		obj.methodPublic2();
		obj.methodPublic2(3,4);
		obj.methodPro1();
	}
}
