
public class Static_method1 {
	
	static void sum() 
	{
		int a = 15;
		int b = 20;
		int sum = a+b;
		System.out.println(sum);
	}
	
	static void mul() {
		int a = 15;
		int b = 20;
		int mul = a*b;
		System.out.println(mul);
		sum();
	}
	public static void main(String[] args) {
		System.out.println("Anmol");
		
		sum();
		mul();
		
		
			}
	
	
			

}

class Static_method4 {
	public static void main(String[]args) {
		
		Static_method1.mul();
		System.out.println("Hello");
		
	}
	
}
