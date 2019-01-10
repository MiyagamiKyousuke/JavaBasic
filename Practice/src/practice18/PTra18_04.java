/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<Player>();
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {

			while (scanner.hasNext()) {
				Player player = new Player();
				String line = scanner.nextLine();
				String[] sPlayer = line.split(",");
				player.setPosition(sPlayer[0]);
				player.setName(sPlayer[1]);
				player.setCountry(sPlayer[2]);
				player.setTeam(sPlayer[3]);
				array.add(player);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		int gk = 0;
		int df = 0;
		int mf = 0;
		int fw = 0;
		int sum = 0;
		Collections.shuffle(array);
		for (int i = 0; i < array.size(); i++) {
			if(sum > 11) {
				break;
			}
			if (gk < 1) {
				if (array.get(i).getPosition().equals("GK")) {
					System.out.println(array.get(i));
					gk++;
					sum++;
				}
			}

			if(df < 4) {
				if (array.get(i).getPosition().equals("DF")) {
					System.out.println(array.get(i));
					df++;
					sum++;
				}
			}
			if(mf < 4) {
				if (array.get(i).getPosition().equals("MF")) {
					System.out.println(array.get(i));
					mf++;
					sum++;
				}
			}
			if(fw < 2) {
				if (array.get(i).getPosition().equals("FW")) {
					System.out.println(array.get(i));
					fw++;
					sum++;
				}
			}
		}

	}
}
