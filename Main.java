package LineComparision;

public class Main {
	
public static void main(String[] args) {
		
		Point P1 = new Point();
	 	InputScanner ip = new InputScanner();
	 	System.out.println("Enter x value for point 1");
		P1.x= ip.inputInteger();
		System.out.println("Enter y value for point 1");
		P1.y =ip.inputInteger(); 
		
		Point P2 = new Point();
		System.out.println("Enter x value for point 2");
		P2.x = ip.inputInteger();
		System.out.println("Enter y value for point 2");
		P2.y = ip.inputInteger();	        
		
		Line line1 = new Line();
		line1.P1 = P1;
		line1.P2 = P2;
		
		Double lineLength1 = line1.getLengthLine1(P1, P2);
		System.out.println("Line 1 Length:" +lineLength1);
 }

}
