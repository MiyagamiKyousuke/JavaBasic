package practice11;
//mistake
/*
 * PTra11_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra11_02 {
	public static void main(String[] args) {

		// ★ ReadFileClassのクラスメソッドreadBookDataFile()を使い、本情報を取得します
		Book[] book1 = FileReaderClass.readBookDataFile();

		System.out.println("探したい本のタイトル（又はその一部）を入力してください");
		String bk = new java.util.Scanner(System.in).nextLine();
		// ★ ユーザが入力した文字列が、本情報のタイトル一部に含まれていた場合は、その本情報を出力してください
		boolean flag = false;
		for(int i = 0; i < book1.length; i++) {


			if(book1[i].title.contains(bk)) {
				System.out.println(book1[i].dispBookInfo());
			}
		}



	}
}
