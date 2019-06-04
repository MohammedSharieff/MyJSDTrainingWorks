interface F
{
	protected int i = 10;
}

// This will give an error as by default it is final public static

/*C:\Users\shariefm\Desktop\Rooman_jsd\abstraction\Interface>javac F.java
F.java:3: error: modifier protected not allowed here
        protected int i = 10;
                      ^
1 error*/