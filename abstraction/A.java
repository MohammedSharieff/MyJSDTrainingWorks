class A
{ 
	public int foo(int a)
	{
		return 10;
	}
	 
	 public int foo(int a)
	{
		 return 20;
	}


	public static void main(String[] args) 
	{
		A a = new A();
		System.out.println(a.foo(1));
		System.out.println(a.foo(2));
	}
}

// overloading - same method name , different number of arguments
// overriding cannot be achived within same class