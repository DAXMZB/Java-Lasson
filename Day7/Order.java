class Order
{
	//field
	private String name;
	private int ruler;
	private int pen;
	private int sum;
	private int all_sum;

	//constructors-->new
	Order(String name,int ruler,int pen)
	{
		if(ruler>=0&&pen>=0)
		{
			this.name=name;
			this.ruler=ruler;
			this.pen=pen;
			sum=ruler*29+pen*30;
		}
	}


	//methods

	String getName()
	{
		return this.name;
	}

	void setName(String name)
	{
		this.name=name;
	}

	int getRuler()
	{
		return this.ruler;
	}
	void setRuler(int ruler)
	{
		if(ruler>=0)
		{
			this.ruler=ruler;
			sum=ruler*29+pen*30;
		}
	}


	void show()
	{
		System.out.println("名:"+name+
			"\t尺:"+ruler+
			"\t筆:"+pen+
			"\t金額:"+sum);
	}
}