import java.util.Objects;

public class Point {
	private int x = 0;
	private int y = 0;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void validation() {
		if ((x >= 0 && x <= 400) && (y >= 0 && y <= 400)) {
			System.out.println("O valor de X é válido: " + this.x);
			System.out.println("O valor de Y é válido: " + this.y);
		} else {
			System.out.println("O valor da coordenada não é válido!");
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void moveBy(int dx, int dy) {
		setX(getX() + dx);
		setY(getY() + dy);
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}
	
}


