//Find the sum of all the primes below two million.
public class p10 {
	public static void main(String args[])
	{
	    boolean cnd=true;
	    long sum=2;
		
		for(long i=3;i<2000000;i=i+2)
		{ 
		    double sr=Math.sqrt(i);
		    long d=Math.round(sr);
		    while(d>1)
		    {
		        cnd=true;
		        if(i%d==0)
		        {
		            cnd=false;
		            break;
		          }
		          d--;
		      }
		      if(cnd)
		      {
		          sum=sum+i;
		  }
		  }
		  System.out.println(sum);
}

}
//output 142913828922
