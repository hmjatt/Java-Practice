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

- [YouTube (How to accept user input in Java)](https://www.youtube.com/watch?v=wAEPokhj5Q4&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=5)

	```
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

```
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

```
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

- [YouTube (Java switch statements)](https://www.youtube.com/watch?v=MY03bt_0JQI&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=11)

```
//	logical operators = used to connect two or more expressions

	&& = (AND) both conditions must be true
 	|| = (OR) either condition must be true
	! = (NOT) reverses boolean value of condition
```

<hr>

#### Quote

    “If you always put limit on everything you do, physical or anything else.
    It will spread into your work and into your life. There are no limits.
    There are only plateaus, and you must not stay there, you must go beyond them.”
    — Bruce Lee

> :fire: :milky_way: :zap:
