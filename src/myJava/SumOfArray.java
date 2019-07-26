package myJava;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3,2,5,1,8,9,7,4};
		int sum = 0;
		
		for (int i=0; i<a.length; i++)
		{
			sum = sum + a[i];
			
		}
		
		System.out.println("The Array sum = " +sum);

	}

}
