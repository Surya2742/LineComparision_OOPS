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
		
		Point P3 = new Point();
		System.out.println("Enter x value for point 3");
		P3.x = ip.inputInteger();
		System.out.println("Enter y value for point 3");
		P3.y = ip.inputInteger();
		
		Point P4= new Point();
		System.out.println("Enter x value for point 4");
		P4.x = ip.inputInteger();
		System.out.println("Enter y value for point 4");
		P4.y = ip.inputInteger();
		
		Line line1 = new Line();
		line1.P1 = P1;
		line1.P2 = P2;
		
		Line line2 = new Line();
		line2.P3 = P3;
		line2.P4 = P4;
		
		Double lineLength1 = line1.getLengthLine1(P1, P2);
		Double lineLength2 = line1.getLengthLine1(P3, P4);
		System.out.println("Line 1 Length:" +lineLength1);
		System.out.println("Line 2 Length:" +lineLength2);
		Line line = new Line();
		line.compare(lineLength1, lineLength2);
 }

}
