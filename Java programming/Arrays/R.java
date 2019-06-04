public class R 
{
	public static void main(String[] args) 
	{
		test (new int[] {10, 2});
	}

	static void test(int x[])
	{
		System.out.println(x.length);
		System.out.println("---------------");
		for(int i:x)
		{
			System.out.println(i);
		}
	}
}
