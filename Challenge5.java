import java.util.Scanner;

class Circle1{
	private double x, y;
	private int radius;
	public Circle1(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show() {
		System.out.println("(" + x + ", " + y + ")" + radius);
	}
}
public class CircleManager {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle1 c [] = new Circle1[3];
		
		for(int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle1(x, y, radius);
		}
		
		for(int i = 0; i < c.length; i++)
			c[i].show();
		
		scanner.close();
	}

}
