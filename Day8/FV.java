class FV
{
	//field
	private static int pv;
	private double r;
	private int n;
	private double fv;

	//constructors
	FV(int pv,double r,int n)
	{
		this.pv=pv;
		this.r=r;
		this.n=n;
		fv=pv*(1+r*n);
	}
	FV(double r,int n)
	{		
		this.r=r;
		this.n=n;
		fv=pv*(1+r*n);
	}
	//methods
	void setR(double r)
	{
		if(r>=0)
		{
			this.r=r;
		}
	}
	static void setPV(int pv)
	{
		FV.pv=pv;
	}
	static String companyName()
	{
		return "巨匠電腦教育中心";
	}
	int call(int x,int y)
	{
		return x*y;
	}
	void show()
	{
		System.out.println("本金:"+pv+"\t利率:"+r+"\t期數:"+n+"\t本利和:"+fv);
	}
}