import java.util.Random;
public class RandomNumbers {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		//limit random integer to be less than 6 and more than 0
		int x = random.nextInt(6)+1;
		
		double y = random.nextDouble();
		boolean z = random.nextBoolean();
		
		System.out.printf("Random Integer: %s\nRandom Double: %s\nRandom Boolean: %s",x, y, z);;
				
	}
}
