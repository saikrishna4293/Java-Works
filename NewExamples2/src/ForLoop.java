
public class ForLoop {

	int array[]={1,2,3,4,5};
	
	public void method(){
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void main(String[] args) {
		ForLoop obj = new ForLoop();
		obj.method();
	}

}
