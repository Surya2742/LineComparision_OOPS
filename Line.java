package LineComparision;

public class Line {

	Point P1, P2, P3, P4;
	int var = 0;
	
	public double getLengthLine1(Point P1, Point P2) {
		return Math.sqrt(Math.pow(P1.x-P2.x, 2)+Math.pow(P1.y-P2.y, 2));
	}
	
	public double getLengthLine2(Point P3, Point P4) {
		return Math.sqrt(Math.pow(P3.x-P4.x, 2)+Math.pow(P3.y-P4.y, 2));
	}
}