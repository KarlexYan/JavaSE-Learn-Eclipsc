package day11_ArrayList;

import java.util.ArrayList;

public class ArrayList6 {
	public static void main(String[] args) {
		ArrayList<User> list = new ArrayList<>();
		User u1 = new User("001","zhangsan","123456");
		User u2 = new User("002","lisi","123456");
		User u3 = new User("003","wangwu","123456");
		list.add(u1);list.add(u2);list.add(u3);
		
		int result  = getIndex(list, "005");
		System.out.println(result);
	}
	
	public static int getIndex(ArrayList<User> list,String id) {
		for(int i=0;i<list.size();i++) {
			boolean flag = list.get(i).getId().equals(id);
			if(flag) {
				return i;
			}
		}
		return -1;
	}
}
