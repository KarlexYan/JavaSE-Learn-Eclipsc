package ExerciseInBook;

public class Ex3_2 {
	public static void main(String [] args) {
		Point p = new Point(10,20);
		p.display();
	}
}
class Point{
	int x,y;
	
	Point(int ix,int iy){
		x=ix;y=iy;
	}
	void display() {
		System.out.println("点p的坐标是：x="+x+";y="+y);
	}
}