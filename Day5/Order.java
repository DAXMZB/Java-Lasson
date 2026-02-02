class Order
{
	//field
	String name;
	int lcd;
	int ram;
	int mouse;
	int sum;

	//construtors
	Order(String name,int lcd,int ram,int mouse)
	{
		if(lcd>=0&&ram>=0&&mouse>=0)
		{
			this.name=name;
			this.lcd=lcd;
			this.ram=ram;
			this.sum=this.lcd*4999+this.ram*1280+this.mouse*799;
		}
		else
		{
			System.out.println("數值不可為負值");
		}
	}

	Order(int lcd,int ram,int mouse)
	{
		if(lcd>=0&&ram>=0&&mouse>=0)
		{
			
			this.lcd=lcd;
			this.ram=ram;
			this.sum=this.lcd*4999+this.ram*1280+this.mouse*799;
		}
	}
	//methods
	void show()
	{
		System.out.printf("lcd：%d\nram：%d\nmouse：%d\n\n",name,lcd,ram,mouse);
	}
}