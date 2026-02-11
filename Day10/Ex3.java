class Ex3
{
	public static void main(String[] args) {
		int[] x=new int[]{10,20,30};
		int[] y=new int[]{40,50,60};
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("x[0]="+x[0]);
		System.out.println("y[0]="+y[0]);
		System.out.println("=================");
		//x=y;//位址=位址-->傳為址-->位址一樣-->同一個->被消滅-->自動回收記憶體-->Garbage Collection->GC
		x[0]=y[0];//值=值-->傳值copy-->不同變數
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("x[0]="+x[0]);
		System.out.println("y[0]="+y[0]);
		System.out.println("=================");
		x[0]=100;
		System.out.println("x[0]="+x[0]);
		System.out.println("y[0]="+y[0]);


		/*
		int x=10;
		int y=20;

		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("=================");
		x=y;
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("=================");
		x=40;
		System.out.println("x="+x);
		System.out.println("y="+y);
		*/


	}
}