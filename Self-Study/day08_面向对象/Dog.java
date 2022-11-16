package day08_面向对象;
// 定义狗类Dog。属性:毛的颜色color，品种breed。行为:吃饭()，看家lookHome()
public class Dog {
	private String color;
	private String breed;
	
	public Dog() {}
	public Dog(String color, String breed) {
		this.color = color;
		this.breed = breed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public void eat() {
        System.out.println(color + "色的" + breed + "正在啃骨头.....");
    }

    public void lookHome() {
        System.out.println(color + "色的" + breed + "正在看家.....");
    }
}
