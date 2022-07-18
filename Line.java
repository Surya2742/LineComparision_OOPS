package LineComparision;

public class Line {

	Point P1, P2;
	int var = 0;
	
	public double getLengthLine1(Point P1, Point P2) {
		return Math.sqrt(Math.pow(P1.x-P2.x, 2)+Math.pow(P1.y-P2.y, 2));
	}
	
}