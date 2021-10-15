package secondhomework;
import java.util.Scanner;
public class CC {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an amount in double, for example 11.56: ");
		double amount =input.nextDouble();
		int remainingAmount = (int)(amount *100);
		int numberofonedollars=remainingAmount/100;
		remainingAmount = remainingAmount % 100;
		int numberofquarters=remainingAmount/25;
		remainingAmount = remainingAmount % 25;
		int numberofdimes=remainingAmount/10;
		remainingAmount = remainingAmount %10;
		int numberofnickels = remainingAmount/5;
		remainingAmount=remainingAmount%5;
		int numberofpennies=remainingAmount;
		System.out.println("Your amount "+amount + "consists of");
		System.out.println(" "+numberofonedollars + " dollars");
		System.out.println(" "+numberofquarters + " quarters");
		System.out.println(" "+numberofdimes + " dimes");
		System.out.println(" "+numberofnickels + " nickels");
		System.out.println(" "+numberofpennies + " pennies");
	}
}