class A
{
	int a;
}

class B extends A
{
	int a ;
	 void Mymethod()
	{
		 this.a =100;
		 System.out.println(a);
	}

	public static void main(String[] args) 
	{ 
		B obj = new B();
		System.out.println(obj.a);
		obj.a = 200;
		A obj2 = new A();
		System.out.println(obj2.a);
		obj2.a = 400;
		System.out.println(obj.a);
		System.out.println(obj2.a);
		obj.Mymethod();
		System.out.println(obj.a);
		System.out.println(obj2.a);
	}
}
