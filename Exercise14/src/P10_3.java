/**
 * El output es:
 * (5, 8)
 * (5, 8)
 * 
 *el objeto 1 y 2 no estan relacionados, ya que "new" crea uno distinto
 */
public class P10_3 {

	public static void printPoint(Point p) {
		System.out.println("(" + p.x + ", " + p.y + ")");
	}

	public static Point findCenter(Rectangle box) {
		int x = box.x + box.width / 2;
		int y = box.y + box.height / 2;
		return new Point(x, y);
	}

	public static void main(String[] args) {
		Rectangle box1 = new Rectangle(2, 4, 7, 9);
		Point p1 = findCenter(box1);
		printPoint(p1);
		box1.grow(1, 1);
		Point p2 = findCenter(box1);
		printPoint(p2);
	}
}
