import java.util.Scanner;

public class HighestNumber {
	private static Scanner sc;
	public static void main(String args[])
	{
		
		int i;	
		int b = 0;
		sc = new Scanner(System.in);
		System.out.println("how many number you want to compare");
		int a  = sc.nextInt();
//		int [] numbers = new int [a-1];
		while (a > 0){
			System.out.println("Enter number:");
			i = sc.nextInt();
			if (b<=i){
				b=i;
			}
	//		numbers[a-1] = i;
			a = a-1;
		}
//	if (numbers[0]>=numbers[1] && numbers[0]>=numbers[2]){
//		b=numbers[0];
//	}else if (numbers[1]>=numbers[0] && numbers[1]>=numbers[2]){
//		b=numbers[1];
		
//	}else if (numbers[2]>=numbers[0]&&numbers[2]>=numbers[1]){
//		b=numbers[2];
//	}	
	System.out.println("Highest number is: " + b);
}

}
