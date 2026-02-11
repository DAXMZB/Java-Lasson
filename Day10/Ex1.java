class Ex1
{
	public static void main(String[] args) {
		//int[] x=new int[3];
		//x[0]=30;

		//double[] x=new double[3];
		boolean[] x=new boolean[3];

		System.out.println(x);
		for(int i=0;i<3;i++)
		{
			System.out.println(x[i]);
		}

		System.out.println("==for-each====");
		//for(int o:x)//:-->指陣列為址+copy-->int o=x[0]
		//for(double o:x)
		for(boolean o:x)
		{
			System.out.println(o);//copy每一個值
		}

		System.out.println("=========================");
		//int[] x2=new int[]{20,15,2};
		//double[] x2=new double[]{20.12,15.3,4.5};
		boolean[] x2=new boolean[]{true,false,true};

		System.out.println(x2);
		for(int i=0;i<3;i++)
		{
			System.out.println(x2[i]);
		}

		System.out.println("=======for-Each=====");
		System.out.println(x2);
		//for(int o:x2)
		//for(double o:x2)
		for(boolean o:x2)
		{
			System.out.println(o);
		}

	}
}