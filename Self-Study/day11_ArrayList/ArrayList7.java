package day11_ArrayList;

import java.util.ArrayList;

public class ArrayList7 {
	public static void main(String[] args) {
		ArrayList<Phone> list = new ArrayList<>();
		Phone p1 = new Phone("小米",1000);
		Phone p2 = new Phone("苹果",8000);
		Phone p3 = new Phone("锤子",2999);
		list.add(p1);list.add(p2);list.add(p3);
		
		ArrayList<Phone> resultList = getPhoneInfo(list);
		for (int i=0;i<resultList.size();i++) {
			Phone p = resultList.get(i);
			System.out.println(p.getBrand()+","+p.getPrice());
		}
	}
	
	public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list) {
		ArrayList<Phone> resultList = new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			int price = list.get(i).getPrice();
			if(price < 3000) {
				resultList.add(list.get(i));
			}
		}
		return resultList;
	}
}
