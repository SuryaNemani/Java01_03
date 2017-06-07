package assignment03;
import java.util.Scanner;
public class compare {
public static void main(String[] args) {
	boolean c,d;
		Scanner Input=new Scanner(System.in);
			System.out.println("Enter First Binary Digit");
			boolean a=Input.nextBoolean();
			System.out.println("Enter Second Binary Digit");
			boolean b=Input.nextBoolean();
	c= a&b;
	d= a&&b;
	System.out.println("The Bitwise AND output " +c);
	System.out.println("The Logical AND output " +d);
}
}
