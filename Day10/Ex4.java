class Ex4
{
	public static void main(String[] args) {
		int[] x=new int[]{10,20,30};
		System.out.println(x);
		for(int i=0;i<x.length;i++)
		{
			System.out.println("x["+i+"]="+x[i]);
		}
		//x[3]=100;
		x=new int[10];//傳為址
		x[3]=100;
		System.out.println(x[3]);
		System.out.println(x);


		System.out.println("================");
		for(int i=0;i<x.length;i++)
		{
			System.out.println("x["+i+"]="+x[i]);
		}

	}

}