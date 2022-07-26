import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
		char sign;
		double num1,num2,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		num1 = sc.nextDouble();
		System.out.println("Choose an operator + or - or * or /");
		sign = sc.next().charAt(0);
		System.out.println("Enter the second number");
		num2 = sc.nextDouble();
		switch (sign) {
			case '+':
				result = num1+num2;
				System.out.println(num1 + " + " + num2 + " = " + result);
				break;
			case '-':
				result = num1-num2;
				System.out.println(num1 + " - " + num2 + " = " + result);
				break;
			case '*':
				result = num1*num2;
				System.out.println(num1 + " * " + num2 + " = " + result);
				break;
			case '/':
				result = num1/num2;
				System.out.println(num1 + " / " + num2 + " = " + result);
				break;
			default:
				System.out.println("Invalid operator");
		}
		
	}
}
