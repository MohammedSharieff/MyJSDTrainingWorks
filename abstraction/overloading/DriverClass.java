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

class Child extends Parent
{
	static void m1()
   {
	System.out.println("from child static m1()");
   }

  void m2()
	{
		System.out.println("from the child non-static(instance)  m2()");
	}

}

class DriverClass
{
	public static void main(String[] args)
	{
		Parent obj1 = new Child();
		obj1.m1();
		obj1.m2();
	}
}

/* method hiding is where we hide the child method and the parent method will be executed
C:\Users\shariefm\Desktop\Rooman_jsd\abstraction\overloading>java DriverClass
from parent static m1()
from the parent non-static(instance)  m2()
early binding is at compile time and late binding is at run time , overloading uses late binding so the parent class member function will be called
2) incase of static the members will be executing at the compile time and for the non static methods the members to be extecuted will be decided at the runtime. 
3) in case of non static member during the runtime that the function will be called , here for which class iam creating the object that matters
4) in case of static that willbe resolved at the compile time, consideering for which class we are creating a refrence not the object, here the refrence matters, the reference created class static method will be executing
it is called method hiding*/