
public class Static_nonstatic {
	int l=450; //non static variable
    int u=430;
    static int t=9; //static global variable
	public static void main(String[] args) {  //static can only call static stuff,non static is not allowed to static
											//non static main function can only take non static function
											//if we want to call non static function in a static main function we need to create an object
		// TODO Auto-generated method stub

		car();
		
		
		//creating an object for car2 function
		
		Static_nonstatic model= new Static_nonstatic();  //instance for an object
		
		
		model.car2();  //non static function
		System.out.println(model.l);
		System.out.println(model.u);
		
		
	}

	
	
	public static void car() {
		
		System.out.println("Mercedez");
		
	}
 
	public void car2() {  //non static function
		System.out.println("Tesla");
		System.out.println(t);
	}
	
	
}