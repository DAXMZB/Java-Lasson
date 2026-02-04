class AddFv
{
	public static void main(String[] args) {
		//FV.pv=20000;
		System.out.println(FV.companyName());
		FV.setPV(50000);
		FV f1=new FV(0.015,2);
		FV f2=new FV(0.014,3);
		FV f3=new FV(0.013,4);
		FV f4=new FV(0.012,5);
		f1.setR(0.011);
		

		f1.show();
		f2.show();
		f3.show();
		f4.show();
	}
}