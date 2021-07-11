import java.util.Scanner;

public class mul2numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the 1st value");
		 int i=scan.nextInt();
		 System.out.println("Enter the 2st value");
		 int j=scan.nextInt();
		 scan.close();
			int mul=i*j;
			
			System.out.println("multiplacation of  two number is  " +mul);

	}

}
