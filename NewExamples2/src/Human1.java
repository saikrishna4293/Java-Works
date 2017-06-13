
public class Human1 {

	int age;
	int weight;

	public void setAge(int age) {
		this.age = age;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public static void main(String[] args) {
		HumanBeing person1 = new HumanBeing();
		person1.setAge(25);
		person1.setWeight(130);
	
		HumanBeing person2 = new HumanBeing();
		person2.setAge(35);
		person2.setWeight(150);
		System.out.println("hii");
		
	}
	}
