import java.util.Scanner;

public class printANum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scan =new Scanner(System.in);//takes input from keyboard
         
         System.out.println(" Enter the value for i"); 
         
         int i=scan.nextInt();// nextInt() reads the next integer from keyboard
         scan.close();
         
         System.out.println("entered number is"  +i);// println prints in new line
         // print prints in same line
//Scan.close();
	}

}
