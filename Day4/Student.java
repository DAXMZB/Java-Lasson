class Student
{
	//field
	String name;
	int chi;
	int eng;
	int sum;

	//constructors
	Student(String name,int chi,int eng)
	{
		if(chi>=0&&chi<=100 && eng>=0&&eng<=100)
		{
			this.name=name;
			this.chi=chi;
			this.eng=eng;
			this.sum=this.chi+this.eng;
		}
		else
		{
			System.out.println("分數需0~100");
		}
	}
	//methods
	void show()
	{
		System.out.println("名："+name+"\t國文："+chi+"\t英文:"+eng+"\t總分:"+sum);
	}
}