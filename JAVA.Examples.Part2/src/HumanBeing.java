
public class HumanBeing {

	int age;
	int weight;
	
	public void setAge(int age) {
		this.age = age;
		int he =9;
		System.out.println(he);
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void nature() {
		if (age>30) {
			System.out.println("he is harsh");
		}
		else{
			System.out.println("he is soft");
		}
	}
	public static void main(String[] args) {
		HumanBeing person1 = new HumanBeing();
		person1.setAge(25);
		person1.setWeight(130);
		
		int height =10;
		System.out.println(height); 
		
		HumanBeing person2 = new HumanBeing();
		person2.setAge(35);
		person2.setWeight(150);
		
		person1.nature();
		person2.nature();
	}
	}