/**
 * 
 */
package jMoped_test;

/**
 * @author Wendy
 *
 */
public class Test_Driver {

	public static void main(String[] args) {
		//System.out.println(fib(6));
		int x[] = {1,2,3,4,5};
		duplicate(x);

	}
	
	public static int t(int x)
	{
		if(x == 1 || x == 2)
		{
			return 1;
		}
		else if(x == 12345)
		{
			
			return t(12343) + t(12344);
		}
		else
		{
			
			return (t(x-1) + t(x-2));
		}		
	}

	public static void duplicate(int a[])
	{
		int length = a.length;
		int b[] = new int[length*2];
		for(int i = 0; i < length*2; i++)
		{
			b[i] = a[i%length];			
		}
		assert(b[length] == a[0]);
		for(int j = 0; j < b.length; j++)
		System.out.println(b[j]);
	}
}
