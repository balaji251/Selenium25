package BasicPackage;

class Testoperators {
	
	int i = 10, j=20,k=30,l=40, o;
	
	public void prefixplusExample() {
		
		
		System.out.println("prefix plus : "+ ++i);
	}
	
	public void postfixplusExample() {
		System.out.println("Postfix plus:" + j++);
		System.out.println("Updated value of j:"+j);
	}
	
	public void prefixminusExample() {
		
		System.out.println("Prefix Minus:"+ --k);
	}
	
	public void postfixminusExample() {
		
		System.out.println("Postfix Minus:" + l--);
		System.out.println("Updated Value of L  :" +l);
		
	}
	public void arithmeticCalculation() {
		
	int m=1250, n=300000;
	
	o = m+n;
	
	System.out.println("addition:" +o);
	
	o = m - n;
	
	System.out.println(" Subtraction: " +o);
	
	o = m * n;
	
	System.out.println(" Multiplication: " +o);
	
	o = n / m;
	
	System.out.println(" Division: " +o);
	
	}
	
	public void relationalOperator() {
		
		int w = 5000;
		
		if(w<= 5000) {
 			
			System.out.println(" Balance is less than or equal 5000");
		}
		
		if (w >= 5000) {
			
			System.out.println(" Value of w is greater than or equal 5000");
		}
		
		if (p!=u ) {
			
		}
	}
	
	
}

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Testoperators tp= new Testoperators();
		//tp.prefixplusExample();
		//tp.postfixplusExample();
		//tp.prefixminusExample();
		//tp.postfixminusExample();
		//tp.arithmeticCalculation();
		tp.relationalOperator();

	}

}
