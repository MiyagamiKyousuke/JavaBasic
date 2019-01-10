/*
 * PTra18_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PTra18_02 {

	/*
	 * ★ BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
	 *
	 * フィールド
	 * 		position	：	String
	 * 		name		：	String
	 * 		country		：	String
	 * 		team		：	String
	 * メソッド
	 * 		各アクセサ
	 *
	 * 		toString()	：	Objectクラスのオーバーライド
	 * 		各フィールドの値を、カンマ区切りの文字列で取得する
	 */

	public static void main(String[] args) {

		/*
		 * entity.Playerの作成後に行ってください
		 *
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



//				player.setPosition(line);
//				player.setName(line);
//				player.setCountry(line);
//				player.setTeam(line);
//				array.add(player.getPosition());
//				array.add(player.getName());
//				array.add(player.getCountry());
//				array.add(player.getTeam());
			}

		} catch (FileNotFoundException e) {
			// TODO: handle exception
		}

		// ★ ArrayListに格納されているインスタンス全てのtoStringメソッドを実行し、出力してください
		// ※ できれば拡張for文を使いましょう

		for(Player p:array) {
			System.out.println(p);


		}

	}
}
