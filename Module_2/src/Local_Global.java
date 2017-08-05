
public class Local_Global {
	
	static int x=600;  //Global variable
    static int t=500;  //Global variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Hello();
	name();
	}
	public static void Hello() {
		 
		int a=100;  //local variable- you can use local variable for only specific variable
		System.out.println(a);
		System.out.println(x);
		System.out.println(t);
	}
   public static void name () {
	   
	   int a=100;  //local variable
	   int c=200;
	   System.out.println(a);   //local variable
	   System.out.println(c);   //local variable
	   System.out.println(t);  //global variable
	   System.out.println(x);  //global variable
   }
   
   
}
