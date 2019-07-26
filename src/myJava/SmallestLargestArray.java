package myJava;

public class SmallestLargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3,2,5,1,8,9,7,4,6};
		
		int small = a[0];
		int large = a[0];
		
		for (int i=1; i<a.length; i++) 
		{
			if (a[i] > large)
				large = a[i];
			else if (a[i] < small )
				small = a[i];
						
		}
		
		System.out.println("The largest array = " + large);
		System.out.println("The smallest array = " + small);

	}

}
