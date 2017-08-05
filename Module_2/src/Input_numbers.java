import java.util.Scanner;
public class Input_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("what is your number?  ");
		int num = in.nextInt();
		System.out.println("what is your 2nd number?  ");
		int num1 = in.nextInt();
		System.out.println("answer of the division");
		float divide = (num1/num);
		System.out.println(divide);

	}

}
