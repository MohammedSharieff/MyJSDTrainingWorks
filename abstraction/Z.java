class Z 
{
	public void test(int a , int b)
	{
		System.out.println("from test(int, int)");
	}
	public void test(int a)
	{
		System.out.println("from test(int)");
	}

	public static void main(String[] args) 
	{
		Z z1= new Z();
		Z z2 = new Z();
		z1.test(10,20);
		z2.test(40);
		System.out.println("Hello World!");
	}
}


//overloading