class Ex1{
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("請輸入次數");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			//if(i==101) break;
			if(i>=41 && i<=60) continue;
			if(i>=86 && i<=95) continue;
			if(i==121) break;
			System.out.println("i="+i+"\thello java");
		}
	}
}