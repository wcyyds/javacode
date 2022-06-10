public class Helloworld
{
	public static void sum(int a, int b)
	{
		int c;
		c = a + b;
		System.out.println(a + "+" + b + "=" + c);
	}
	public static void main(String[] args)
	{
			System.out.println("Helloworld");
			Helloworld.sum(10,20);
	}
}