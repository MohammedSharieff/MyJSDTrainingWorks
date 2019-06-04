abstract class A
{
	A()
	{
		System.out.println("A()");
	}

	abstract void test1();

	void test2()
	{
		System.out.println("from A.test2");
	}

	abstract void test3();
}  

abstract class B extends A
{
	B(int i)
	{
		System.out.println("B(int)");
	}

	void test1()
	{
		System.out.println("from B.test1");
	}
}

	class L extends B
{
	L()
	{
	super(90);
	System.out.println("from C");
	}

	void test3()
	{
		System.out.println("from C.test3");

	}
}

class M
{
	public static void main(String[] args) 
	{
		L obj = new L();
		obj.test1();
		obj.test2();
		obj.test3();
		System.out.println("done");
	}
}
