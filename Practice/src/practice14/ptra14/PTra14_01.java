/*
 * PTra14_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice14.ptra14;

public class PTra14_01 {

	public static void main(String[] args) {
		String couseName;
		String[] courseunit = new String[8];
		JavaCourse javaCourse = new JavaCourse();
		String courseName = javaCourse.getCourseName();
		String[] courseNames = courseName.split(",");
		for(int i = 0; i < courseNames.length; i++) {
			if (i == 0) {
				System.out.println(courseNames[i]);
			} else {
				System.out.println("\t" + courseNames[i]);
			}
		}

		courseunit = javaCourse.getCourseUnit();

		for (int i = 0; i < courseunit.length; i++) {
			if (i == 0) {
				System.out.println(courseunit[i]);
			} else {
				System.out.println("\t" + courseunit[i]);
			}

		}

	}

	/*
	 * ★ common.Courseを実装した、JavaCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】Java」
	 * 単元
	 * 		式と演算
	 * 		制御構文
	 * 		メソッド
	 * 		配列
	 * 		オブジェクト指向
	 * 		継承
	 * 		高度な継承
	 */

}
