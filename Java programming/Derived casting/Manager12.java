class Manager12 
{
	public static void main(String[] args) 
	{
		A a1 = (A) new B();//done explicitly
		A a2 = new B();
		C c1 = new D();
		C c2 = (C) new D();//done explicitly
		System.out.println("Done");
	}
}
