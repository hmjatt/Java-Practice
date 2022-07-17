
public class ArithmaticExpressions {
	public static void main(String[] args) {
		/* 
		 *		expression =     operands & operators
		 *		operands =  values, variables, numbers, quantity
		 *		operators = + - * / % 
		 *		+ ==> Addition
		 *		- ==> Subtraction
		 *		* ==> Multiplication
		 *		/ ==> Division
		 *		% ==> Modulus(Remainder of the two numbers after division) 
		 *		-- ==> Increment(Increase value of variable by 1)
		 *		++ ==> Decrement(Decrease value of variable by 1)
		 */
		
		int friends = 10;
		
		friends = friends + 1;
		System.out.println(friends);
		
		friends = friends - 1;
		System.out.println(friends);
		
		friends = friends * 2;
		System.out.println(friends);
		
		friends = friends / 5;
		System.out.println(friends);
		
		friends = friends % 3;
		System.out.println(friends);
		
		friends--;
		System.out.println(friends);
		
		friends++;
		System.out.println(friends);

	}
}
