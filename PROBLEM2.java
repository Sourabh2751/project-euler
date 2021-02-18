
/*By considering the terms in the Fibonacci sequence 
 * whose values do not exceed four million, find the sum of the even-valued terms.*/

public class PROBLEM2
{
	public static void main (String args[])
{
	int a=0,b=1,fib=0,sum=0,c=4000000;
	while(fib<=c)
	{
		fib=a+b;
		a=b;
		b=fib;
		if(fib%2==0)
		{
			sum=sum+fib;
		}
	}
	System.out.println("Sum of even Fibonacci numbers is="+sum);
}
}
//output Sum of even Fibonacci numbers is=4613732
