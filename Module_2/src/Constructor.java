

public class Constructor {

	 int age;
	 int salary;
     int house;
     String name;
     
     // the purpose of constructor is to re write your default values.
     //constructor variables always have to be non static.
     
     Constructor()
     {
    	 int age=20;
    	 int salary=6000;
         int house=2;
         String name="Jack";
    	 
         System.out.println(age);
    	 System.out.println(salary);
    	 System.out.println(house);
    	 System.out.println(name);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor x = new Constructor();
		
		
		

	}

}
