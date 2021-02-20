//Find the sum of all the primes below two million.
package projecteuler;
public class PROBLEM10 {
	public static void main(String args[])
	{ 
		long n=2000000,sum=0;
		 boolean prime[] = new boolean[(int) (n+1)]; 
	        for(int i=0;i<n;i++) 
	            prime[i] = true; 
	          
	        for(int p = 2; p*p <=n; p++) 
	        { 
	            
	            if(prime[p] == true) 
	            { 
	                
	                for(int i = p*p; i <= n; i += p) 
	                    prime[i] = false; 
	            } 
	        } 
	        for(int i = 2; i <= n; i++) 
	        { 
	            if(prime[i] == true) 
	                sum=sum+i;
	        } 
		  System.out.println(sum);
}

}
//output 142913828922
