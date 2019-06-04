class Parent 
{
	int a = 10;
	static int b = 20;

	void myParentMethod()
	{
		System.out.println("from my parent method");
	}

}

class Base extends Parent
{
	void myMethod()
	{
		super.myParentMethod();
		this.myMethodThis();
        System.out.println(super.a);
		this.b = 400;
		System.out.println(super.b);
	}

    void myMethodThis()
	{
	super.myParentMethod();
	System.out.println("from this method");

	}

	public static void main(String[] args) 
	{   
		//super.a = 700;
		new Base().myMethod();
	}
}
