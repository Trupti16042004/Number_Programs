import java.util.Scanner;
class Automorphic_Number
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
		int len = 0;
		int div =1;

		for(int i=num ;i>len ;i/=10)
			len++;

//		System.out.print(len);

		for(int i=1; i<=len ;i++)
			div*=10;

		if(num == ((num*num)%div))
			System.out.print(num + " is a Automorphic_Number");
		else 
			System.out.print(num + " is not an Automorphic_Number");






	}
}