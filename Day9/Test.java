class Test
{
	private int x1;
	private static int x2;
	Test()
	{
		x1++;
		x2++;
	}
	void show()
	{
		System.out.println("x1="+x1+"\tx2="+x2);
	}
	void show1()
	{
		System.out.println("hello non-static");
	}
	static void show2()
	{
		System.out.println("hello static");
	}
}