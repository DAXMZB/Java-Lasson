class Ex2{
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("請輸入列數");
		int n=sc.nextInt();
		System.out.print("請輸入行數");
		int m=sc.nextInt();

		// for(int x=1;x<=n;x++)
		// {
		// 	for(int y=1;y<=m;y++)
		// 	{
		// 		System.out.print(y+"*"+x+"="+(x*y)+"\t");
		// 	}
		// 	System.out.println();
		// }
		a:
		for(int x=1;x<=n;x++) //列數
		{
			for(int y=1;y<=m;y++) //行數
			{
				if(x==8) break a;
				if(y==8) break;
				System.out.print(x+"*"+y+"="+(x*y)+"\t");
			}
			System.out.println();
		}
	}
}