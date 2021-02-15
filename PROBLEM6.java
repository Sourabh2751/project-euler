
//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
public class p6 {
	
		public static void main(String args[])
		{
			int sum1=0;
		int sum2=0;
		int diff;
		int sum=0;
		int n =100;
		
		sum1 = (n*(n+1))/2;
		sum1=sum1*sum1;
		sum2 = (n*(n+1)*((2*n)+1))/6;
		diff = sum1-sum2;
		System.out.println(diff);
	
			
		}
	}
//output Difference is=25164150

