# Java-Practice

This repo contains projects/code snippets to practice Java

## Details About This Repository :computer:

This project is created to practice Java :coffee: and topics that I learn throughout my journey by following various sources. Creating numerous projects/code snippets helps me to solidify my knowledge of specific topic. I am using JDK 17 :package: because it's the latest LTS release for Java SE along with Eclipse IDE :waning_crescent_moon: Feel free to reach me at [Twitter](https://twitter.com/hmjatt/) :comet:

## Repository Structure

    .
    ├── Project Name              # Java project folder
    │   ├── src                   # Source files folder
    │   │   └── SourceCode.java   # Java source code file
    │   ├── .classpath            # User environment variables
    │   └── .project              # for saving/loading projects into the Eclipse IDE
    ├── .gitignore
    ├── LICENSE
    └── README.md

## Topics that I have learned so far

### 1. Setting Up Eclipse IDE and Tips!!! ☕

- [Youtube (Java Tutorial for beginners)](https://www.youtube.com/watch?v=NBIUbTddde4&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=1)

<hr>

### 2. Variables ✘

- A placeholder for a value that behaves as the value it contains.

- Resources

	- [Oracle (Official Java Tutorial)](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html)

	- [Oracle (Official Java Language Specification)](https://docs.oracle.com/javase/specs/jls/se17/html/jls-4.html)

	- [YouTube (Variables in Java)](https://www.youtube.com/watch?v=so1iUWaLmKA&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=2)

<hr>

### 3. Swap Two Variables 🥤

- Create a temporary variable to store one of the variables and used this `temp` variable to swap two variables.

- [YouTube (Variables in Java)](https://www.youtube.com/watch?v=G0mFJUFMzjs&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=3)

<hr>

### 4. Accept User Input ⌨️

- Import **Scanner** class from Java Utility Package Library. Use methods created using **scanner** class to get input from user and output the result in the console.

- [YouTube (How to accept user input in Java)](https://www.youtube.com/watch?v=wAEPokhj5Q4&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=4)

<hr>

### 5. Arithmetic Expressions 🧮

- Perform basic math operations on **Java Variables**

- [YouTube (Arithmetic Expressions in Java)](https://www.youtube.com/watch?v=wAEPokhj5Q4&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=5)

	```java
	expression = operands & operators
	operands = values, variables, numbers, quantity
	operators = + - * / %

	+ ==> Addition
	- ==> Subtraction
	* ==> Multiplication
	/ ==> Division
	% ==> Modulus(Remainder of the two numbers after division)
	-- ==> Increment(Increase value of variable by 1)
	++ ==> Decrement(Decrease value of variable by 1)

	```
<hr>

### 6. GUI Intro ⭐

- Show a **basic dialog box** and output the values using `JOptionPane` class

- [YouTube (Java GUI intro)](https://www.youtube.com/watch?v=rWCnZKF-U3Q&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=6)

<hr>

### 7. Java Math Class 📐

- Learnt about some useful **methods** of `Math` class.

- Create a program that finds **Hypotenuse** of a *Triangle*.

- [YouTube (Java Math Class)](https://www.youtube.com/watch?v=w0VTlSOXBs8&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=7)

<hr>

### 8. Java random numbers 🎲

- Create a program that generates *random values* for `integers`, `double`, `boolean` values.

- [YouTube (Java random numbers)](https://www.youtube.com/watch?v=VMZLPl16P5c&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=8)

<hr>

### 9. Java if statements 🚧

- Create a program to practice `if`, `else if` and `else ` statements in Java.

- [YouTube (Java if statements)](https://www.youtube.com/watch?v=MY03bt_0JQI&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=9)

```java
// if statement = performs a block of code if it's condition evaluates to be true
		
		int age = 75;
		
		if(age==75) {
			System.out.println("You are an old timer!");
		}
		else if(age>=18) {
			System.out.println("You are an adult!");
		}
		else if(age>=13) {
			System.out.println("You are a teenager!");
		}
		else {
			System.out.println("You are not an adult!");
		}
```

<hr>

### 10. Java switch statements ⬇

- Create a program to practice `switch` statements in Java.

- [YouTube (Java switch statements)](https://www.youtube.com/watch?v=MY03bt_0JQI&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=10)

```java
// switch = statement that allows a variable to be tested for equality against a list of values
			
	String day = "Friday";

	switch(day) {
		case "Sunday": System.out.println("It is Sunday!");
		break;
		case "Monday": System.out.println("It is Monday!");
		break;
		case "Tuesday": System.out.println("It is Tuesday!");
		break;
		case "Wednesday": System.out.println("It is Wednesday!");
		break;
		case "Thursday": System.out.println("It is Thursday!");
		break;
		case "Friday": System.out.println("It is Friday!");
		break;
		case "Saturday": System.out.println("It is Saturday!");
		break;
		default: System.out.println("That is not a day!");
	}
```

<hr>

### 11. Java logical operators ❗ (AND OR NOT)

- Create a program to practice `logical operators` statements in Java and how to create a more specific expressions by combining multiple `logical operators`.

- [YouTube (Java logical operators)](https://www.youtube.com/watch?v=MY03bt_0JQI&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=11)

```java
//	logical operators = used to connect two or more expressions

	&& = (AND) both conditions must be true
 	|| = (OR) either condition must be true
	! = (NOT) reverses boolean value of condition
```

<hr>

### 12. Java while loop 🔄

- Create a program to practice `for loop` in Java.

- [YouTube (Java while loop)](https://www.youtube.com/watch?v=MY03bt_0JQI&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=12)

```java
// for loop = executes a block of code a limited amount of times
		
	for(int i=10; i>=0; i--) {
		System.out.println(i);
	}
	System.out.println("Happy new year!");
```

<hr>

### 13. Java for loop ➰

- Create a program to practice `while loop` in Java.

- [YouTube (Java for loop)](https://www.youtube.com/watch?v=MY03bt_0JQI&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=13)

```java
// while loop = executes a block of code as long as a it's condition remains true

	//while `name field` is *blank* keep asking user for their name
	while(name.isBlank()) {
		System.out.print("Enter your name: ");
		name = scanner.nextLine();
	}
```

<hr>

### 14. Java nested loops ➿

- Create a program to practice `nested loops` in Java.

- [YouTube (Java nested loop)](https://www.youtube.com/watch?v=MY03bt_0JQI&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=14)

```java
// nested loops = a loop inside of a loop
		
	Scanner scanner = new Scanner(System.in);
	int rows;
	int columns;
	String symbol = "";
	
	System.out.println("Enter # of rows: ");
	rows = scanner.nextInt();
	System.out.println("Enter # of columns: ");
	columns = scanner.nextInt();
	System.out.println("Enter symbol to use: ");
	symbol = scanner.next();
	
	for(int i=1; i<=rows; i++) {
		System.out.println();
		for(int j=1; j<=columns;j++) {
			System.out.print(symbol);
		}
	}
```

<hr>

### 15. Java arrays 🚗

- Create a program to implement `Arrays` in Java.

- [YouTube (Java arrays)](https://www.youtube.com/watch?v=MY03bt_0JQI&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=15)

```java
// array = used to store multiple values within a single variable
	
	String[] cars = new String[3];
	
	cars[0] = "Camaro";
	cars[1] = "Corvette";
	cars[2] = "Tesla";
```

<hr>

### 16. Java 2D arrays 🚚

- Create a program to implement `2D Arrays` in Java.

- [YouTube (Java 2D arrays)](https://www.youtube.com/watch?v=MY03bt_0JQI&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=16)

```java
// 2D array = an array of arrays(Multi-dimentional Array)
		
	String[][] cars = 	{	
							{"Camaro","Corvette","Silverado"},
							{"Mustang","Ranger","F-150"},
							{"Ferrari","Lambo","Tesla"}
						};
	
	/*								  0			1		   2
	cars[0][0] = "Camaro";		0	 Camaro	| Corvette | Silverado
	cars[0][1] = "Corvette";	   ---------+----------+-----------
	cars[0][2] = "Silverado";	1	Mustang	|  Ranger  |   F-150
	cars[1][0] = "Mustang";		   ---------+----------+-----------
	cars[1][1] = "Ranger";		2	Farrari	|  Lambo   |   Tesla
	cars[1][2] = "F-150";
	cars[2][0] = "Ferrari";
	cars[2][1] = "Lambo";
	cars[2][2] = "Tesla";
	*/
```

<hr>

### 17. Java String methods 💬 

- Create a program to learn about `String methods` in Java.

- [YouTube (Java 2D arrays)](https://www.youtube.com/watch?v=MY03bt_0JQI&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=17)

```java
// String = a reference data type that can store one or more characters
// reference data types have access to useful methods
  
	String name = "Bro";
	
	//boolean result = name.equalsIgnoreCase("bro");
	//int result = name.length();
	//char result = name.charAt(0);
	//int result = name.indexOf("o");
	//boolean result = name.isEmpty();
	//String result = name.toUpperCase();
	//String result = name.toLowerCase();
	//String result = name.trim();
	//String result = name.replace('o', 'a');
	
	//System.out.println(result);
```

<hr>

### 18. Java wrapper classes 🎁

- Create a program to learn about `Wrapper Classes` in Java.

- [YouTube (Java wrapper classes)](https://www.youtube.com/watch?v=MY03bt_0JQI&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=18)

```java
// wrapper class = 	provides a way to use primitive data types as reference data types
//					reference data types contain useful methods
//					can be used with collections (ex.ArrayList)
	
	//primitive		//wrapper
	//---------		//-------
	// boolean		Boolean
	// char			Character
	// int			Integer
	// double		Double
	
	// autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
	// unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
	
	Boolean a = true;
	Character b = '@';
	Integer c = 123;
	Double d = 3.14;

```

<hr>

### 19. Java ArrayList 🧾

- Create a program to implement `ArrayList` in Java.

- [YouTube (Java ArrayList)](https://www.youtube.com/watch?v=MY03bt_0JQI&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=19)

```java
// ArrayList = 	a resizable array. 
	//				Elements can be added and removed after compilation phase
	//				store reference data types
	
	ArrayList<String> food = new ArrayList<String>();
	
	food.add("pizza");
	food.add("hamburger");
	food.add("hotdog");
	
	//food.set(0, "sushi");
	//food.remove(2);
	//food.clear();
	
	for(int i=0; i<food.size(); i++) {
		System.out.println(food.get(i));

```

<hr>

### 20. 2D ArrayList 📜

- Create a program to practice `2D ArrayList` in Java.

- [YouTube (Java 2D ArrayList)](https://www.youtube.com/watch?v=MY03bt_0JQI&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=20)

```java
// 2D ArrayList = dynamic list of lists and size of lists can be changed during
// runtime

	ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
	ArrayList<String> bakeryList = new ArrayList();
	bakeryList.add("pasta");
	bakeryList.add("garlic bread");
	bakeryList.add("donuts");
	
	ArrayList<String> produceList = new ArrayList();
	produceList.add("tomatoes");
	produceList.add("zucchini");
	produceList.add("peppers");
	
	ArrayList<String> drinksList = new ArrayList();
	drinksList.add("soda");
	drinksList.add("coffee");
	
	groceryList.add(bakeryList);
	groceryList.add(produceList);
	groceryList.add(drinksList);
	
	System.out.println(groceryList);

```

<hr>

### 21. For-each loop 🔃

- Create a program to learn about `for-each loop 🔃` in Java.

- [YouTube (Java for-each loop)](https://www.youtube.com/watch?v=MY03bt_0JQI&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=21)

```java
// for-each = traversing technique to iterate through the elements in an array/collection
// pros = less steps, more readable 
// cons = less flexible
		
	//String[] animals = {"cat","dog","rat","bird"};
	ArrayList<String> animals = new ArrayList<String>();
	
	animals.add("cat");
	animals.add("dog");
	animals.add("rat");
	animals.add("bird");
	
	for(String i : animals) {
		System.out.println(i);
	}

	~ cat
	~ dog
	~ rat
	~ bird

```

<hr>

### 22. Methods 📞

- Create a program to implement `Methods` in Java.

- [YouTube (Java methods 📞)](https://www.youtube.com/watch?v=MY03bt_0JQI&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=22)

```java
public static void main(String[] args) {
	
	// method = a block of code that is executed whenever it is called upon
	
	int x = 3;
	int y = 4;
	
	int z = add(x,y);

	System.out.println(z);
}

static int add(int x, int y) {
	
	int z = x + y;
	return z;
	
}

~ 7

```

<hr>

### 23. Overloaded Methods ☎️

- Create a program to practice `Overloaded Methods` in Java.

- [YouTube (Java Overloaded Methods ☎️)](https://www.youtube.com/watch?v=MY03bt_0JQI&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=23)

```java
public static void main(String[] args) {

// overloaded methods = methods that share the same name but have different parameters
// method name + parameters = method signature

double x = add(1.0,2.0,3.0,4.0);

System.out.println(x);
	
}
static int add(int a, int b) {
	System.out.println("This is overloaded method #1");
	return a + b;
}
static int add(int a, int b, int c) {
	System.out.println("This is overloaded method #2");
	return a + b + c;
}
static int add(int a, int b, int c, int d) {
	System.out.println("This is overloaded method #3");
	return a + b + c + d;
}
static double add(double a, double b) {
	System.out.println("This is overloaded method #4");
	return a + b;
}
static double add(double a, double b, double c) {
	System.out.println("This is overloaded method #5");
	return a + b + c;
}
static double add(double a, double b, double c, double d) {
	System.out.println("This is overloaded method #6");
	return a + b + c + d;
}	

~ "This is overloaded method #6"
~ 10.0

```

<hr>

### 24. Printf 🖨️

- Create a program to learn about `printf` in Java.

- [YouTube (Java printf 🖨️)](https://www.youtube.com/watch?v=MY03bt_0JQI&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=24)

```java
// printf() = 	an optional method to control, format, and display text to the console window
//				two arguments = format string + (object/variable/value)
//				% [flags] [precision] [width] [conversion-character]
				
	boolean myBoolean = true;
	char myChar = '@';
	String myString = "Bro";
	int myInt = 50;
	double myDouble = 1000;
		
	// [conversion-character]	"\n" is to print next statement on a new line
	System.out.printf("%b\n",myBoolean);
	System.out.printf("%c\n",myChar);
	System.out.printf("%s\n",myString);
	System.out.printf("%d\n",myInt);
	System.out.printf("%f\n",myDouble);
	
	//[width]
	// minimum number of characters to be written as output
	System.out.printf("Hello %10s\n",myString);
	
	//[precision]
	// sets number of digits of precision when outputting floating-point values
	System.out.printf("You have this much money %.1f\n",myDouble);
	
	// [flags]
	// adds an effect to output based on the flag added to format specifier
	// - : left-justify
	// + : output a plus ( + ) or minus ( - ) sign for a numeric value
	// 0 : numeric values are zero-padded
	// , : comma grouping separator if numbers > 1000
	
	System.out.printf("You have this much money %,f",myDouble);

~ true
~ @
~ Bro
~ 50
~ 1000.000000
~ Hello        Bro
~ You have this much money 1000.0
~ You have this much money 1,000.000000

```

<hr>

### 25. Final keyword ⛔

- Create a program to implement `Final keyword` in Java.

- [YouTube (Final keyword ⛔)](https://www.youtube.com/watch?v=MY03bt_0JQI&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=25)

```java
public static void main(String[] args) {
	final double PI = 3.14159;
	//PI = 4;  //You can't change a final variable
	System.out.println(PI);
}

~ 3.14159


```

<hr>

#### Quote

    “If you always put limit on everything you do, physical or anything else.
    It will spread into your work and into your life. There are no limits.
    There are only plateaus, and you must not stay there, you must go beyond them.”
    — Bruce Lee

> :fire: :milky_way: :zap:
