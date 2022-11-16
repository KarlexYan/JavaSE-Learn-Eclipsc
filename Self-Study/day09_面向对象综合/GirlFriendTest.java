package day09_面向对象综合;

import java.util.Arrays;

public class GirlFriendTest {
	public static void main(String[] args) {
		GirlFriend arr[] = new GirlFriend[4];
		
		GirlFriend gf1 = new GirlFriend("邓绮雯",22,'女',"打王者");
		GirlFriend gf2 = new GirlFriend("潘倩怡",22,'女',"逛街");
		GirlFriend gf3 = new GirlFriend("黄彬",21,'女',"不知道");
		GirlFriend gf4 = new GirlFriend("小米粥",24,'女',"直播");
		
		arr[0]=gf1;arr[1]=gf2;arr[2]=gf3;arr[3]=gf4;
		
		
		int sum=0;
		for (int i=0;i<arr.length;i++) {
			GirlFriend girl = arr[i];
			sum += girl.getAge();
		}
		double avg = sum *1.0/arr.length;
		System.out.println("avg="+avg);
		
		int count=0;
		for (int i=0;i<arr.length;i++) {
			GirlFriend girl = arr[i];
			if(girl.getAge()<avg) {
				System.out.println("name="+girl.getName()+",age="+girl.getAge()+",gender="+girl.getGender()+",hobby="+girl.getHobby());
				count++;
			}
		}
		System.out.println("count="+count);
	}
}
