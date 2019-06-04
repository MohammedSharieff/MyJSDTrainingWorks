class Parent 
{
	static void m1()
	{
		System.out.println("from parent static m1()");
	}

	void m2()
	{
		System.out.println("from the parent non-static(instance)  m2()");
	}
}

class Child extends parent
{
	static void m1()
   {
	System.out.println("from child static m1()");
   }

  void m2()
	{
		System.out.println("from the parent non-static(instance)  m2()");
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

class DriverClass
{
	public static void main(String[] args)
	{
		Parent obj1 = new Child();
		obj1.m();
		obj1.m();
	}
}
