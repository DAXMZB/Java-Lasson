class Student
{
	//fields
	String name;
	private int chi;
	private int eng;
	private int sum;

	//constructors
	Student(String name,int chi,int eng)
	{
		if(chi>=0 && eng>=0)
		{
			this.name=name;
			this.chi=chi;
			this.eng=eng;
			this.sum=chi+eng;
			System.out.println("New Member!");
		}
		
	}

	//methods
	void change1(int chi,int eng)
	{
		if(chi>=0 && eng>=0)
		{
			this.name=name;
			this.chi=chi;
			this.eng=eng;
			this.sum=chi+eng;
			
		}
	}
	int change2(int chi,int eng)
	{
		if(chi>=0 && eng>=0)
		{
			this.name=name;
			this.chi=chi;
			this.eng=eng;
			this.sum=chi+eng;
			
		}
		return sum;
	}
	void show()
	{
		System.out.printf("姓名:%s\nchi：%d\neng：%d\nsum：%d\n",name,chi,eng,sum);
	}
}