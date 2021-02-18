
package projecteuler;
//What is the 10 001st prime number?
public class PROBLEM7 {
	
		public static void main(String args[])
		{
			int Switch = 1;
			int count =2;
			int prime =5;
			while(Switch==1)
			{
				if(isprime(prime))
				{
					count = count+1;
					prime = prime+2;
				}
				else
				{
					prime  = prime+2;
				}
				if(count==10001)
				{
					Switch =0;
					System.out.println(prime-2);
				}
				
				
			}
			
			
			// TODO Auto-generated method stub

		}
		public static boolean isprime(int no)
		{
			if(no<=2)
			{
				return false;
			}
			if(no%2==0)
			{
				return false;
			}
			if(no%3==0)
			{
				return false;
			}
			int h =(int)Math.floor(Math.sqrt(no)+1);
			int i =5;
			while(i<=h)
			{
				
				if(no%i==0||no%(i+2)==0)
				{
					return false;
				}
				i=i+6;
			}
			return true;
	
		
		
		
	}
		
}

/*OUTPUT-104743*/
