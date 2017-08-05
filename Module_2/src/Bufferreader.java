import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
   
   public static void main(String[] args) throws Exception {
      String thisLine = null;
      
      try {
      
         // open input stream test.txt for reading purpose.
         BufferedReader br = new BufferedReader("C:\\Users\\taufiq\\Desktop\\techfios");
         
         while ((thisLine = br.readLine()) != null) {
            System.out.println(thisLine);
         }       
      } catch(Exception e) {
         e.printStackTrace();
      }
   }
}