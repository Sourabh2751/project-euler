package projecteuler;
import java.math.BigInteger;
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
public class p5 {
	public static void main(String[] args) {
		p5 ob = new p5();
	System.out.println(ob.multiple());

		// TODO Auto-generated method stub

	}
	public static String multiple()
	{
		BigInteger allcm = BigInteger.ONE;
		for(int i =1;i<=20;i++)
		{
			allcm = lcm(BigInteger.valueOf(i),allcm);
		}
		return allcm.toString();

		
	}
	public static BigInteger lcm (BigInteger x,BigInteger y) {
		return x.divide(x.gcd(y)).multiply(y);
		
	}
}
//output 232792560
