class Neon_Number
{
	public static void main(String[] args) {
		
		int num =1;
		int div =1;
		int sum =0;

		int sqrt = num * num;

		for(int i=sqrt ; i>0; i/=10)
		{
			int rem = i%10;
			sum = sum +rem;
		}
			System.out.print((num == sum)? "it is a neon number ": "it is not an Neon_Number");


	} 
}
