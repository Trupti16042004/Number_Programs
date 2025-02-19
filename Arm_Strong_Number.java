import java.util.Scanner;
class ArmStrong_Practice
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);


		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int length = 0 , pow = 1,sum=0 ;
		int dup=num;

		for(int i= num ;i > 0 ; i/=10)
		length++;

		for(int i = num ;i>0;i/=10)
		{
			int rem = i%10;
			

			
		pow=1;
		for(int j = 1; j<=length;j++)
		{
			pow *=rem;
		}
		sum+=pow;


	}
		System.out.println
		(sum==dup?dup+" : is a armstrong number":dup+" :is not armstrong number");




	}
}
