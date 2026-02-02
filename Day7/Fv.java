class Fv
{
	//field
	int pv;
	double r;
	int n;
	double fv;

	//constructor
	Fv(int pv,double r,int n)
	{
		this.pv=pv;
		this.r=r;
		this.n=n;
		this.fv=pv*(1+r*n);
	}

	//methods
	void show()
	{
		System.out.printf("本金：%d\t利率：%f\t期數：%d\t本利合：%f\n",pv,r,n,fv);
	}
}