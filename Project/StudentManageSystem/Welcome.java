package StudentManageSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Welcome {
	public static void main(String[] args) {
		ArrayList<User> list = new ArrayList<>();
		Scanner reader = new Scanner(System.in);
		while (true) {
			System.out.println("欢迎来到学生管理系统");
			System.out.println("请选择操作：1登录 2注册 3忘记密码 4退出");

			String choose = reader.next();
			switch (choose) {
			case "1" -> {
				login(list);
			}
			case "2" -> {
				register(list);
			}
			case "3" -> {
				forget(list);
			}
			case "4" -> {
				System.out.println("谢谢使用，再见！");
				System.exit(0);
			}
			default -> {
				System.out.println("没有该选项，请重新输入");
			}
			}
		}
	}

	public static void login(ArrayList<User> list) {
		Scanner reader = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入用户名：");
			String username = reader.next();
			boolean flag = contains(list, username);
			if (!flag) {
				System.out.println("用户名" + username + "未注册，请注册后再登录！");
				return;
			}
			System.out.println("请输入密码：");
			String password = reader.next();

			while (true) {
				String rightCode = getCode();
				System.out.println("验证码为：" + rightCode);
				System.out.println("请输入验证码：");
				String code = reader.next();
				if (!(code.equalsIgnoreCase(rightCode))) {
					System.out.println("验证码错误！");
					continue;
				} else {
					System.out.println("验证码正确!");
					break;
				}
			}

			User userInfo = new User(username, password, null, null);
			boolean result = checkUserInfo(list, userInfo);
			if (result) {
				System.out.println("登录成功！");
				StudentSystem sms = new StudentSystem();
				sms.startStudentSystem();
				break;
			} else {
				System.out.println("登录失败，用户名或密码错误！");
				if (i == 2) {
					System.out.println("账号" + username + "被锁定，请联系管理员");
					return;
				} else {
					System.out.println("当前还剩下" + (2 - i) + "次机会");
				}
			}
		}
	}

	public static void register(ArrayList<User> list) {
		Scanner reader = new Scanner(System.in);
		String username;
		String password;
		String personID;
		String phoneNumber;
		while (true) {
			System.out.println("请输入用户名：");
			username = reader.next();
			boolean flag1 = checkUserName(username);
			if (!flag1) {
				System.out.println("用户名格式不符合要求，请重新输入！");
				continue;
			}
			boolean flag2 = contains(list, username);
			if (flag2) {
				System.out.println("用户名" + username + "已存在，请重新输入！");
			} else {
				System.out.println("用户名" + username + "可用！请继续操作！");
				break;
			}
		}

		while (true) {
			System.out.println("请输入要注册密码：");
			password = reader.next();
			System.out.println("请再次输入要注册密码：");
			String comfirmPassword = reader.next();
			if (!password.equals(comfirmPassword)) {
				System.out.println("两次密码不一致，请重新输入！");
				continue;
			} else {
				System.out.println("密码一致，请继续操作");
				break;
			}
		}

		while (true) {
			System.out.println("请输入要注册的身份证号码：");
			personID = reader.next();
			boolean flag = checkPersonID(personID);
			if (flag) {
				System.out.println("身份证格式符合要求，请继续操作！");
				break;
			} else {
				System.out.println("身份证格式不符合要求，请重新输入！");
				continue;
			}
		}

		while (true) {
			System.out.println("请输入要注册的手机号码：");
			phoneNumber = reader.next();
			boolean flag = checkPhoneID(phoneNumber);
			if (flag) {
				System.out.println("手机号码格式符合要求!");
				break;
			} else {
				System.out.println("手机号码格式不符合要求，请重新输入！");
				continue;
			}
		}

		User u = new User(username, password, personID, phoneNumber);
		list.add(u);
		System.out.println("用户注册成功！");
		printArrayList(list);

	}

	public static void forget(ArrayList<User> list) {
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String username = reader.next();
		boolean flag = contains(list, username);
		if(!flag) {
			System.out.println("用户"+username+"都不存在，你忘记你马呢？");
			return;
		}
		
		System.out.println("请输入身份证号码：");
		String personID = reader.next();
		System.out.println("请输入手机号码：");
		String phoneNumber = reader.next();
		
		int index = findIndex(list, username);
		User user = list.get(index);
		if(!(user.getPersonID().equalsIgnoreCase(personID) && user.getPhoneNumber().equals(phoneNumber))) {
			System.out.println("身份证和手机号都对不上号，你改nm呢？");
			return;
		}
		
		String password;
		while(true) {
			System.out.println("请输入新的密码：");
			password = reader.next();
			System.out.println("请再次输入新的密码：");
			String confirmPassword = reader.next();
			if(!(password.equals(confirmPassword))) {
				System.out.println("你好像密码都输不明白喔？");
				continue;
			}else {
				break;
			}
		}
		user.setPassword(password);
		System.out.println("密码修改成功！");
	}

	private static int findIndex(ArrayList<User> list,String username) {
		for(int i=0;i<list.size();i++) {
			User user = list.get(i);
			if(user.getUsername().equals(username)) {
				return i;
			}
		}
		return -1;
	}
	
	private static boolean checkUserInfo(ArrayList<User> list, User userInfo) {
		for (int i = 0; i < list.size(); i++) {
			User user = list.get(i);
			if (user.getUsername().equals(userInfo.getUsername())
					&& user.getPassword().equals(userInfo.getPassword())) {
				return true;
			}
		}
		return false;
	}

	private static String getCode() {
		ArrayList<Character> list = new ArrayList<>();
		for (int i = 0; i < 26; i++) {
			list.add((char) ('A' + i));
			list.add((char) ('a' + i));
		}
		StringBuilder sb = new StringBuilder();
		Random rd = new Random();
		for (int i = 0; i < 4; i++) {
			char c = list.get(rd.nextInt(list.size()));
			sb.append(c);
		}

		int number = rd.nextInt(10);
		sb.append(number);

		char[] arr = sb.toString().toCharArray();
		int randomIndex = rd.nextInt(arr.length);
		char temp = arr[randomIndex];
		arr[randomIndex] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;
		return new String(arr);
	}

	private static void printArrayList(ArrayList<User> list) {
		for (int i = 0; i < list.size(); i++) {
			User u = list.get(i);
			System.out.println("用户名为：" + u.getUsername() + "\t密码为：" + u.getPassword() + "\t身份证号码为：" + u.getPersonID()
					+ "\t手机号码为：" + u.getPhoneNumber());
		}
	}

	private static boolean checkPhoneID(String phoneID) {
		if (phoneID.length() != 11) {
			return false;
		}
		if (phoneID.startsWith("0")) {
			return false;
		}
		for (int i = 0; i < phoneID.length(); i++) {
			char c = phoneID.charAt(i);
			if (!(c >= '0' && c <= '9')) {
				return false;
			}
		}
		return true;
	}

	private static boolean checkPersonID(String personID) {
		if (personID.length() != 18) {
			return false;
		}
		if (personID.startsWith("0")) {
			return false;
		}
		for (int i = 0; i < personID.length() - 1; i++) {
			char c = personID.charAt(i);
			if (!(c >= '0' && c <= '9')) {
				return false;
			}
		}
		char lastNumber = personID.charAt(personID.length() - 1);
		if (!((lastNumber >= '0' && lastNumber <= '9') || lastNumber == 'x' || lastNumber == 'X')) {
			return false;
		}
		return true;
	}

	private static boolean checkUserName(String username) {
		int len = username.length();
		if (len < 3 || len > 15) {
			return false;
		}

		for (int i = 0; i < username.length(); i++) {
			char c = username.charAt(i);
			if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
				return false;
			}
		}
		int count = 0;
		for (int i = 0; i < username.length(); i++) {
			char c = username.charAt(i);
			if ((c >= 'a') && c <= 'z' || (c >= 'a') && c <= 'z') {
				count++;
				break;
			}
		}
		return count > 0;

	}

	private static boolean contains(ArrayList<User> list, String username) {
		for (int i = 0; i < list.size(); i++) {
			String uname = list.get(i).getUsername();
			if (uname.equals(username)) {
				return true;
			}
		}
		return false;
	}
}
