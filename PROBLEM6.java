
//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
public class p6 {
	
		public static void main(String args[])
		{
			int i,sum=0,sum1=0,sqr;
			int diff=0;
			for(i=1;i<=100;i++)
			{
			sum=sum+(i*i);
			sum1=sum1+i;
			}
			 sqr=(int)Math.pow(sum1,2);
			diff=(int)sqr-sum;
			System.out.println("Difference is="+diff);
			
		}
	}
//output Difference is=25164150

