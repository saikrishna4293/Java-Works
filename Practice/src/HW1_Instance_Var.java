
public class HW1_Instance_Var {

	int year_model;
	int days_for_construction;
	
	public void setYear_model(int year_model) {
		this.year_model = year_model;
	}
	public void setDays_for_construction(int days_for_construction) {
		this.days_for_construction = days_for_construction;
	}
	public void status(){
		if (year_model>1900){
			System.out.println("	House is good and strong");
		}
		else {
			System.out.println("	House needs renovation");
		}
	}

	public static void main (String args[]){
	
		HW1_Instance_Var House1 = new HW1_Instance_Var();
		House1.setYear_model(1950);
		House1.setDays_for_construction(120);
		System.out.println("House1 status:");
		House1.status();
		
		HW1_Instance_Var House2 = new HW1_Instance_Var();
		House2.setYear_model(1800);
		House2.setDays_for_construction(90);
		System.out.println("House2 status:");
		House2.status();
	}
}