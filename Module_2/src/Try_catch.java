import java.util.Scanner;
public class Try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
try {   //tries the specific code
		Scanner in = new Scanner(System.in);
		System.out.println("what is your number?  ");
		int num = in.nextInt();
		System.out.println("what is your 2nd number?  ");
		int num1 = in.nextInt();
		System.out.println("answer of the division");
	    int divide = (num/num1);
		System.out.println(divide);

	} catch(Exception e) {
		System.out.println("Don't divide by 0 or input any words");
	}  //tries to catch every exception. e means all kinds or errors
	}

}
