
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	numbers(5);	
	country(5.5);
		

	}
	
	public static void numbers (int i) {
		
		System.out.println(i);
	}
	
	public static void numbers (long u) {
		System.out.println(u);
	}
	
	public static void country (int y) {
		System.out.println(y);
		
	}
	
	public static void country (double u) {
		System.out.println(u);
	}

}
