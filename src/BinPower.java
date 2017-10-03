import java.util.Scanner;

public class BinPower {
	
	Scanner input = new Scanner(System.in);
	String name = "";


	public BinPower() {
		
		
	}
	
	public void setBinary() {
		
		double base;
		double exp;
		int ans = 0;
		
		System.out.println("Hello Java Student! What is your name? ");
		name = input.nextLine();
		System.out.println("Thanks for using my progam " + name + ".");
		
		System.out.println("Which exponent do you want " + name + "?");
		exp = input.nextDouble();
		System.out.println(name + " you have entered " + exp + " as your exponent." );
		
		ans = (int) Math.pow(2, exp);

		
		System.out.println("Answer is: " + ans);
		
	}
	
	
	
}

		