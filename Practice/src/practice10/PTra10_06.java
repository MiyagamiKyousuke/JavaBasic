package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();

		car1.color = "red";
		car2.color ="blue";
		car3.color ="yellow";

		car1.gasoline = 30;
		car2.gasoline =30;
		car3.gasoline =40;


		final int distance = 300;


		int n = 0;
		for (int i = 0; i < distance;) {
			i += car1.run();
			if (car1.gasoline < 0) {
				break;
			}
			n++;
		}
		int x = 0;
		for (int i = 0; i < distance;) {
			i += car2.run();
			if (car2.gasoline < 0) {
				break;
			}
			x++;
		}

		int y = 0;
		for (int i = 0; i < distance;) {
			i += car3.run();
			if (car3.gasoline < 0) {
				break;
			}
			y++;
		}

		System.out.println("目的地にまで" + n + "時間かかりました。残りのガソリンは、" + car1.gasoline + "リットルです");
		System.out.println("目的地にまで" + x + "時間かかりました。残りのガソリンは、" + car2.gasoline + "リットルです");
		System.out.println("目的地にまで" + y + "時間かかりました。残りのガソリンは、" + car3.gasoline + "リットルです");
	}
}
