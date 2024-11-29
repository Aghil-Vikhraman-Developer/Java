\\A private access specifier can be accessed only within the defined class
\\A private variable can be accessed by the public fuction within the class


class Outter{
	private int x =100;
	private void msg(){System.out.println("I cannot be accessed");}
}
class PrivateSpecifier{
	public static void main(String[] args){
	Outter obj1 = new Outter();
	int y = obj1.x;
	System.out.println(y);
	obj1.msg();	
}
}