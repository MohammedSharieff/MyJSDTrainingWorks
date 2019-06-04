class MyClassThis 
{
	int a =10;
	static int b= 20;
	void methodThis()
	{
		System.out.println(a);
		this.a = 100;
		System.out.println(a);
		System.out.println(b);
		this.b  = 600;
		System.out.println(b);
	}

  public static void main(String[] args)
	{

	  new MyClassThis().methodThis();
	}
}
