
public class Sett {

	int a; 
	int b;
	
	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getA() {
		return 10;
	}

	public static void main(String[] args) {

		Sett ob = new Sett();
		ob.setA(5);
		System.out.println(ob.getA());
	}
}
