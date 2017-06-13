
public class HW1_Loc_var {
	
	public void father_age(){
		int father_age = 75;
		if (father_age>60){
			System.out.println("He is old");
		}
		else{
			System.out.println("He isn't old");
		}
	}
	public static void main(String[] args) {
		
		HW1_Loc_var fage = new HW1_Loc_var();
		fage.father_age();
		int a =10;
		int b= 15;
		System.out.println ("a+b = " + (a-b));
	}
}
