package day10_字符串;

import java.util.Scanner;

public class StringDemo7 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int money;
		while (true) {
			System.out.println("请录入一个金额：");
			money = reader.nextInt();
			if (money >= 0 && money <= 9999999) {
				break;
			} else {
				System.out.println("你是不是觉得你很幽默？");
			}
		}

		String moneyStr = "";

		while (true) {
			int ge = money % 10;
			String capitalNumber = getCapitalNumber(ge);

			moneyStr = capitalNumber + moneyStr;

			money = money / 10;

			if (money == 0) {
				break;
			}
		}
		
		

		System.out.println(moneyStr);

		int count = 7 - moneyStr.length();
		for (int i = 0; i < count; i++) {
			moneyStr = "零" + moneyStr;
		}
		System.out.println(moneyStr);

		String[] arr = { "佰", "拾", "万", "仟", "佰", "拾", "元" };
		String result = "";
		for (int i = 0; i < moneyStr.length(); i++) {
			char c = moneyStr.charAt(i);
			result = result + c + arr[i];
		}
		System.out.println(result);

	}

	public static String getCapitalNumber(int number) {
		String[] arr = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };

		return arr[number];
	}
}
