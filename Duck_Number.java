import java.util.Scanner;
class Duck_Number
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a NUmber : ");
		String str = sc.next();

		if(str.charAt(0)=='0')
		{
			System.out.print("not a Duck Number");
		}
		else if (str.contains("0"))
		{
			System.out.print("it is a Duck_Number");
		}
		else {
			System.out.print("It is not a Duck Number");
		}
	}
}