import java.util.Scanner;

public class HighestNumber {
	private static Scanner sc;
	public static void main(String args[])
	{
		int a = 3;
		int i;	
		int b = 0;
		int [] numbers = new int [3];
		sc = new Scanner(System.in);
		while (a > 0){
			System.out.println("Enter number:");
			i = sc.nextInt();
			numbers[a-1] = i;
			a = a-1;
		}
	if (numbers[0]>=numbers[1] && numbers[0]>=numbers[2]){
		b=numbers[0];
	}else if (numbers[1]>=numbers[0] && numbers[1]>=numbers[2]){
		b=numbers[1];
		
	}else if (numbers[2]>=numbers[0]&&numbers[2]>=numbers[1]){
		b=numbers[2];
	}	
	System.out.println("Highest number is: " + b);
}

}
