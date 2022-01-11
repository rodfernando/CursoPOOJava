import java.util.ArrayList;

public class Programa {
	public static ArrayList<Point> list = new ArrayList<>();

	public static void main(String [] args) {

		Point p1 = new Point(10, 20);
		Point p2 = new Point(20, 30);
		Point p3 = new Point(30, 40);
		Point p50 = new Point(50, 50);

		// Storing Points
		list.add(p1); list.add(p2); list.add(p3); list.add(p50);	
		System.out.println("Contem ponto? "+Programa.containsPoint(p50));
		System.out.println("Soma de coordenadas X: "+Programa.sumOfAllXCoordinates());
		System.out.println("Soma de coordenadas Y: "+Programa.sumOfAllYCoordinates());
	}

	public static boolean containsPoint(Point p) {
		for (Point point : list) {
			if(point.equals(p)) {
				return true;
			}
		}
		return false;
	}

	public static int totalPointOccurrences(Point p) {
		int cont = 0;
		for (Point point : list) {
			if(point.equals(p)) {
				cont++;
			}
		}
		return cont;
	}

	public static int sumOfAllXCoordinates() {
		int sumX = 0;
		for (Point point : list) {
			sumX += point.getX();
		}
		return sumX;
	}

	public static int sumOfAllYCoordinates() {
		int sumY = 0;
		for (Point point : list) {
			sumY += point.getY();
		}
		return sumY;
	}
}

