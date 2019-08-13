package arithmetic;
//Find n-th fibonacci number


public class Fibonacci {
//0 1 1 2 3 5 8 13...
	
	//using iterative method
	public static int nfibo(int n)
	{
		int f0 = 0;
		int f1 = 1;
		int f2 = 0;
		
		for (int i=2; i<=n; i++)
		{
			f2= f1 + f0;
			f0 = f1;	
			f1 = f2;
		}
		return f2;
	}
	
	//using recursion
	public static int fibo(int n)
	{
		if(n<=1)
		{
			return n;
		}
		else
		{
			return fibo(n-1) + fibo(n-2);
		}
	}
	
	//using Dynamic Programming
	public static int fib(int n)
	{
		//array to store fibonacci number
		int f[] = new int[n+1];
		
		f[0] = 0;
		f[1] = 1;
		
		for (int i=2; i<=n; i++)
		{
			f[i] = f[i-1] + f[i-2];
		}
		return f[n];
	}
	
	public static void main(String[] args)
	{
		int n = 5;
		int m = 12;
		System.out.println(nfibo(n));
		System.out.println(fibo(n));
		System.out.println(fib(n));
		
		System.out.println(nfibo(m));
		System.out.println(fibo(m));
		System.out.println(fib(m));
	}
	
}

