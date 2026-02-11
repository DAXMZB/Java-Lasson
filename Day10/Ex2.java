class Ex2
{
	public static void main(String[] args) {
		//int[] x1=new int[6];
		int[] x1=new int[]{10,5,77,77,52,63,71,85};
		System.out.println(x1);
		System.out.println(x1.length);
		System.out.println("==================");

		for(int i=0;i<x1.length;i++)
		{
			System.out.println(x1[i]);
		}

		System.out.println("===========for-Each=====");

		for(int o:x1)
		{
			System.out.println(o);
		}




	}
}