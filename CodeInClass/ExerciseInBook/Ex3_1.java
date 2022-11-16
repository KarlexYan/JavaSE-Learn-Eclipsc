package ExerciseInBook;
class Birthday{
	int year,month,day;
	
	public void setDate(int y,int m,int d) {
		year=y;month=m;day=d;
	}
	
	public void display() {
		System.out.println("出生日期："+year+"-"+month+"-"+day);
	}
}
public class Ex3_1 {
	public static void main(String[] args) {
		Birthday b = new Birthday();
			b.setDate(2000, 06, 15);
			b.display();
	}
}
