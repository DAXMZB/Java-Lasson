class AddOrder
{
	public static void main(String[] args) {
		Order o=new Order("aa",-5,5);
		o.show();

		System.out.printf("名:%s\n",o.getName());
		o.setName("b");
		o.setRuler(100);
		System.out.println("名："+o.getName()+"\t尺："+o.getRuler());
		o.show();
	}
}