
public class Two_array_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Rainbow []=new String[8];
		
		Rainbow[0]="Yellow1";
		Rainbow[1]="Red1";
		Rainbow[2]="Orange1";
		Rainbow[3]="Green1";
		Rainbow[4]="Blue1";
		Rainbow[5]="Indigo1";
		Rainbow[6]="pink1";
		Rainbow[7]="Black1";
		
		for(int i=0; i<Rainbow.length;i++) {
			System.out.println(Rainbow[i]);
			
			System.out.println("*************************");
			
			
			
		     //r //c            //r //c
			String colors [] []= new String [3] [4] ;	
					//1st row

					colors [0][0]="green2";
					colors [0][1]="Black2";
					colors [0][2]="Pink2";
					colors [0][3]="Orange2";
					
					//2nd row
					
					colors [1][0]="yellow2";
					colors [1][1]="purple2";
					colors [1][2]="blue2";
					colors [1][3]="white2";
					
					//3rd row
					colors [2][0]="violet2";
					colors [2][1]="gray2";
					colors [2][2]="red2";
					colors [2][3]="royal blue2";
					
					int rows=colors.length;
					int cols=colors[0].length;
					//argument for rows
					//for (int rownum=0;rownum<rows;rownum++)
						//argument for color
					//for (int column=0;column<cols;column++)
					//argument for printing rows and columns

					System.out.println(colors[0][0]);
					System.out.println(colors[0][1]);
					System.out.println(colors[0][2]);
					System.out.println(colors[0][3]);
					System.out.println(colors[1][0]);
					System.out.println(colors[1][1]);
					System.out.println(colors[1][2]);
					System.out.println(colors[1][3]);
					System.out.println(colors[2][0]);
					System.out.println(colors[2][1]);
					System.out.println(colors[2][2]);
					System.out.println(colors[2][3]);
					
					
					//System.out.println(rows);
					//System.out.println(cols);
					
				}

	}

}
