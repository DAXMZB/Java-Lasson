class Fv
{
	//field
	int pv;
	double r;
	int n;
	double fv;

	//constructors
	Fv(int pv,double r,int n)
	{
		this.pv=pv;
		this.r=r;
		this.n=n;
		fv=pv*(1+r*n);
	}

	//f.show();

}