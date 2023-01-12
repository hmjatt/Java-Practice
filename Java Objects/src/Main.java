
public class Main {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		Car myCar1= new Car();
		Car myCar2 = new Car();
		
		
		System.out.println(myCar1.make);
		System.out.println(myCar1.model);
		System.out.println();
		System.out.println(myCar2.make);
		System.out.println(myCar2.model);
		myCar.drive();
	}
}
