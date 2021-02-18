
/*What is the largest prime factor of the number 600851475143 ?*/
public class PROBLEM3
{
static long pf(long n)
{
long p=-1;
while (n%2==0)
{
p = 2;
n=n/2;
}
for (int i=3;i<=Math.sqrt(n);i=i+2)
{
	while(n%i==0)
	{
		p=i;
		n=n/i;
	}
}
if(n>2)
p=n;
 return p;
}
public static void main(String[] args)
{
 long n = 600851475143L;
System.out.println(pf(n));
}}
//output 6857
