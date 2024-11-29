//Default Access Modifier can be accessed only from within the same pacakage or within the same file
class Default{
	public static void main(String[] args){
		DefaultOutter obj = new DefaultOutter();
		System.out.println("Object for default Access Modifier is created....");
		obj.msg();
}
}