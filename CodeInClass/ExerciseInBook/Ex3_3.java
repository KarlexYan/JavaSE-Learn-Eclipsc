package ExerciseInBook;
class Points {
	int x,y;
	
	//不带参数的构造方法
	Points(){
		x=0;y=0;
	}
	
	//带参数的构造方法（重载）
	Points(int ix,int iy){
		x=ix;y=iy;
	}
	
	//成员方法
	void display() {
		System.out.println("x="+x+";y="+y);
	}
	
	//重载成员方法display
	void display(String s) {
		System.out.println(s+""+"x="+x+";y="+y);
	}
}

public class Ex3_3 {
	public static void main(String[] args) {
		Points p1 = new Points();
		p1.display();
		Points p2 = new Points(10,20);
		p2.display("p2 ");
	}
}
