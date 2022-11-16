package day10_字符串;
import java.util.Scanner;
public class StringDemo9 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		String cardNumber;
		while(true) {
			System.out.println("请输入身份证号码：");
			cardNumber = reader.next();
			if(cardNumber.length() == 18) {
				break;
			}else {
				System.out.println("身份证输不明白？");
			}
		}
		//445302200006150619
		String birthYear = cardNumber.substring(6,10);
		String birthMouth = cardNumber.substring(10,12);
		String birthDay = cardNumber.substring(12, 14);
//		System.out.println(birthYear + "," + birthMouth + "," + birthDay);
		System.out.println("出生日期为："+birthYear+"-"+birthMouth+"-"+birthDay);
		char genderNumber = cardNumber.charAt(16);
//		int num = 48-genderNumber;
		if(genderNumber %2 == 0) {
			System.out.println("性别为：女");
		}else {
			System.out.println("性别为：男");
		}
	}
}
