import java.util.Scanner;
import java.util.Date;
class Ex1
{
	public static void main(String[] args) {
		java.lang.Thread t1=new java.lang.Thread(); //絕對路徑 
		Thread t2=new Thread();//相對路徑(java 預設為 java.lang)

		java.util.Scanner sc=new java.util.Scanner(System.in);//絕對路徑		
		Scanner sc2=new Scanner(System.in);

		Date d=new Date();
		System.out.println(d);
	}	
}