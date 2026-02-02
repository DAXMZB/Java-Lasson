class AddOrder
{
	public static void main(String[] args) {
		Order o1=new Order("a",1,1);
		Order o2=new Order(1,2);
		o1.show();
		o2.show();
		System.out.println("==================");
		o2.change("y",4,4);
		o1.show();
		o2.show();


		/*Order o=new Order("a",5,5);

		o.show();
		//o.ruler=-5;
		o.show();

		System.out.println("名:"+o.getName()+"\t尺:"+o.getRuler());
		o.setName("aaaaa");
		o.setRuler(100);
		System.out.println("名:"+o.getName()+"\t尺:"+o.getRuler());
		o.show();*/

	}
}