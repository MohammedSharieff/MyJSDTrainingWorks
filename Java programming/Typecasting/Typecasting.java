//byte < short < int < long < float < double

class A
{
	public static void main(String[] args) 
	{
		int i =10;
		double d = i;
		System.out.println(d);
		System.out.println(i);
		System.out.println("done");

		double i =10.0;
		int d = i;
		System.out.println(d);
		System.out.println(i);
	}
}
