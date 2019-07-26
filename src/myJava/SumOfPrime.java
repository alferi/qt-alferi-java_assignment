package myJava;

public class SumOfPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		for (int number =2; number <= 100; number++)
		{
			if(CheckPrime(number))
			{
				sum +=number;
				
			}
		}
		
		System.out.println("Sum of the prime numbers between 0 to 100 = " +sum);
		
	}
	
	public static boolean CheckPrime(int number) {
		for (int i =2; i<=number /2 ; i++) 
		{
			if (number % i == 0)
			{
				return false;
			}
		}
		
		return true;
	}

}
