class AddStudent
{
	public static void main(String[] args) {
		Student s1=new Student("a",15,25);
		Student s2=new Student("b",65,65);
		s1.show();
		s2.show();
		System.out.println("======================");
		s1.change1(65,70);
		s2.change1(85,75);
		s1.show();
		s2.show();
		System.out.println("======================");
		System.out.printf("重整合計為：%d\n",s1.change2(25,30)+s2.change2(35,55));
	}
}