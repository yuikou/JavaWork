package xxx;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class HomeWork1 {
	public static void main(String[] args) {
		// 1. 計算積與和
		int a = 12, b = 6;
		System.out.println("和為" + (a + b) + ", 積為" + a * b);
		// 此處兩個變數的和之計算有用到+號,假如不用()圈起來, 系統將視為字串連結的"+"來處理

		// 2. 蛋有幾打
		int egg = 200, dozen = 12;
		System.out.println(egg + "顆蛋等於" + (egg / dozen) + "打加上" + (egg % dozen) + "顆蛋");
		// 使用%來計算餘數

		// 3.256559秒的天時分秒轉換
		int sec, min, hour, day;
		sec = 256559;
		day = sec / (24 * 60 * 60); // 轉換成天數
		sec = sec % (24 * 60 * 60); // 剩餘的秒數
		hour = sec / (60 * 60); // 剩下的秒數轉成小時
		sec = sec % (60 * 60);
		min = sec / 60; // 剩餘的秒數轉成分鐘
		sec = sec % 60;
		if (day > 0) {
			System.out.println("計算後結果為" + day + "天" + hour + "小時" + min + "分" + sec + "秒");
		} else {
			System.out.println("計算後結果不滿一天, 為" + day + "天" + hour + "小時" + min + "分" + sec + "秒");
		}

		// 4.圓的計算
		final double Pi = 3.1415;
		int radius = 5;
		double circum, square;
		square = radius * radius * Pi;
		circum = (radius * 2) * Pi;
		System.out.println("半徑為" + radius + "的圓, 其面積為" + square + ", 圓周長為" + circum);

		// 5. 複利計算
		// 複利公式 FV = PV * (1+R) ^ N
		int pv = 1500000;
		double rate = Math.pow((1 + 0.02), 10);
		double fv;

		fv = pv * rate;
		System.out.println("10年後的本金加利息為" + fv + "元");

		// =======第二種算法=======
		// 使用BigDecimal 讓小樹運算更精確
		BigDecimal pv1 = new BigDecimal("1500000"); // 使用字串定義本金150萬
		BigDecimal rate1 = new BigDecimal(1.02); // 使用double定義銀行複利利率 1+2%
		BigDecimal result = new BigDecimal(0); // 定義計算結果result
		result = pv1.multiply(rate1.pow(10));

		System.out.println("10年後的本金加利息為" + result.setScale(2, RoundingMode.HALF_EVEN) + "元");
		// 用銀行家捨入法將結果取至小數點後2位

		// 6.
		System.out.println(5 + 5); // 數字預設型別int的計算(int + int)
		System.out.println(5 + '5'); // int 5 加上char5, unicode編碼5為0x35, 0x35換算十進位為53, 53+5故得58
		System.out.println(5 + "5"); // int 5加上字串 String 5

	}

}
