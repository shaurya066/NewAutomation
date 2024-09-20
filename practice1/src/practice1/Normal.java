package practice1;

public class Normal {

	public static void main(String[] args) {
		int a=10;
		int b=6;
		int c=25;
		
		
		int d='a';
		double f=60.5;
		double g=a+b+d+f;
		boolean h=true;  
				
		System.out.println( a |b);// if one true then answer also true if one false one true then answer also true
		
		System.out.println( a ^b);
		// if one true then true otherwise false
		
		System.out.println( a &b);
		// both true then answer will be true
		System.out.println("Value of a after pre-increment: " + a);
		System.out.println("Value of b: " + ++b);
		
		
		

	}

}
