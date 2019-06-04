class P
{
	public static void main(String[] args) 
	{
		double d1 = 10.9;
		int i = d1;
		System.out.println("done");
	}
}

/* p.java:6: error: incompatible types: possible lossy conversion from double to int
                int i = d1;
                        ^
1 error
*/