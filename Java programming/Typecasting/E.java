class E
{
	static void test(double d)
	{
		System.out.println("test(double)");
	}

	public static void main(String[] args) 
	{
		int i = 100;
		test(i);
		System.out.println("done");
	}
}

//the compiler will be upcasting in this case as int is smalled and double is bigger value