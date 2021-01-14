package projecteuler;
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
public class p5 {
	public static void main(String args[])
	{
		int i=1,J,min=0,c=0;
		while(i>0)
		{
			for(J=1;J<=20;J++)
			{
				if(i%J==0)
				{
					c=1;
				}
				else{
					c=0;
					break;
					}}i++;
					if(c==1)
					{
						min=i-1;
						break;
						
					}
				}
			System.out.println(min);	
	}
}
//output 232792560
