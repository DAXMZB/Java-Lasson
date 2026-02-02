class Order{
	//field-->欄位
	String name;
	int pen;
	int ruler;
	int sum;


	//constructors
	Order(int pen)
	{
		pen=10;
		// System.out.println("新增一筆訂單");
	}
	//methods
	void show()
	{
		System.out.println("名:"+name+"\t筆"+pen+"\t尺:"+ruler+"\t金額:"+sum);
	}
}