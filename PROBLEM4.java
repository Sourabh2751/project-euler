
//Find the largest palindrome made from the product of two 3-digit numbers.
public class p4 {
	
		public static void main(String args[])
		{
			int i,J,max=0,max2,p,pro,rem,rev;
			for(i=100;i<=999;i++)
			{
				for(J=100;J<=999;J++)
				{rem=0;rev=0;
					p=i*J;
					pro=p;
					while(pro>0)
					{
						rem=pro%10;
						rev=(rev*10)+rem;
						pro=pro/10;
						}
					if(p==rev)
					{
						max2=p;
						if (max2>max)
						{
							max=max2;
						}
					}
				}
			}
			System.out.println(max);
		}
	}
//output 906609
