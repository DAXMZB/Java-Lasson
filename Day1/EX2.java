class EX2
{
	 public static void main(String[] args) {
	 	int x=1,y=1;
	 	boolean b=++x>++y; //x=x+1;y=y+1;x>y->false; b=false
	 	boolean b=++x>y++ //x=x+1;x>y->true;y=y+1; b=true
	 	boolean b=x++>++y;//y=y+1;x>y->false;x=x+1;b=false
       System.out.println("b="+b);
       System.out.println("x="+x);
       System.out.println("y="+y);


	 }
}