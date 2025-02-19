import java.util.Scanner;
class Tech_Number
{
	public static void main(String[] args) {
		
	int num  = new Scanner(System.in).nextInt();
	int len = 0;
	int div  = 1;
	int sqrt=1;	

	for(int i = num ; i>0 ; i/=10)
		len++;

	for(int i = 1;i<=(len/2);i++)
	{
		div*=10;
		int sum = (num/div)+(num%div);
		sqrt = sum*sum;

		
	}
	System.out.println((sqrt==num) ? num+" is a TECH number" : num+" is not a TECH number");

	
	}
}