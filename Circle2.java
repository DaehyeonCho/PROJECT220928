
public class circle {
	int radius;
	String name;
	
	public circle() {
		radius = 1; name = "";
	}
	
	public circle(int r, String n) {
		radius = r; name = n;
	}
	public double getArea() {
		return 3.14 * radius * radius;
	}

	public static void main(String[] args) {
		circle pizza = new circle(10, "자바피자"); 
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		circle donut = new circle(); 
		donut.name = "도넛피자";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}

}
