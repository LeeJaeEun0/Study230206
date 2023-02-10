package Ch06_Object_oriented_Programming;

public class Ex6_14_Member_Variable_Initalization {
	static {
		System.out.println("static( )");
	} // end of static
	
	{
		System.out.println("{ }");
	} // end of { }
	
	public Ex6_14_Member_Variable_Initalization() {
		System.out.println("생성자");
	} // end of public 
	
	public static void main(String[] args) {
		System.out.println("Ex6_14 bt = new bt Ex6_14();");
		Ex6_14_Member_Variable_Initalization bt = new Ex6_14_Member_Variable_Initalization();
		
		System.out.println("Ex6_14 bt2 = new bt Ex6_14();");
		Ex6_14_Member_Variable_Initalization bt2 = new Ex6_14_Member_Variable_Initalization();
		
	} // end of main

} // end of class
