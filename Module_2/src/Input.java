import java.util.Scanner;
public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader= new Scanner(System.in);  // scanner object with input argument
		System.out.println(" your number");
		int n=reader.nextInt();
		System.out.println("put one more number");
		int p =reader.nextInt();
		int sum=n+p;
		System.out.println("your number is "+sum);
	}

}
