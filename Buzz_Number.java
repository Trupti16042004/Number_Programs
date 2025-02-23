class Buzz_Number
{
	public static void main(String[] args) {
		
		int num = 49;

		for(int i= num ;i>0 ;i/=10)
		{
			int rem = i%10;

			if(rem == 7 || num%7==0)
			{
				System.out.print("It is a Buzz_Number");

				break;
			}
		}
	}
}