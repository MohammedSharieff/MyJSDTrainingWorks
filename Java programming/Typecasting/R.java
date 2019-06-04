class R 
{
	static void test(int i)
	{
		System.out.println("test:" +i);
	}

	public static void main(String[] args) 
	{
		byte b = 10;
		double d1= 10.8;
		test(b);
		test((int)d1); //converting 10.8 to 10
		System.out.println("done");
	}
}
