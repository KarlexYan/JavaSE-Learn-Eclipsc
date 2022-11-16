package day04_判断与循环;
//李雷想买一个价值7988元的新手机，她的旧手机在二手市场能卖1500元，而手机专卖店推出以旧换新的优惠，把她的旧手机交给店家，新手机就能够打8折优惠。为了更省钱，李雷要不要以旧换新？请在控制台输出。
public class day04_1 {
	public static void main(String [] args) {
		int market = 7988-1500;System.out.println(market);
		double store = 7988*0.8;System.out.println(store);
		if (market>store) {
			System.out.println("以旧换新更省钱");
		}else {
			System.out.println("以旧换新更花钱");
		}
	}
}
