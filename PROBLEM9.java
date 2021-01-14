
//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.
public class p9 {
	
		public static void main(String args[])
		{
			
			int i,j,k=0;
			for(i=1;i<=1000;i++)
			{
				for(j=i+1;j<1000;j++)
				{
					
					k=1000-i-j;
					if((k*k)==(i*i)+(j*j))
					{
	    System.out.println("Product of Pythagorean triplet is="+i*j*k);
					 break;
				 	}}
				 	}
				 	}
				 	}
//output Product of Pythagorean triplet is=31875000
				


