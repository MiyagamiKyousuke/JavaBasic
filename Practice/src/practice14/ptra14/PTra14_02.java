/*
 * PTra14_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice14.ptra14;

public class PTra14_02{

	public static void main(String[] args) {
		String couseName;
		String[] courseunit = new String[5];
		DBCourse dbCourse = new DBCourse();
		String courseName = dbCourse.getCourseName();
		String[] courseNames = courseName.split(",");
		for(int i = 0; i < courseNames.length; i++) {
			if (i == 0) {
				System.out.println(courseNames[i]);
			} else {
				System.out.println("\t" + courseNames[i]);
			}
		}

		courseunit = dbCourse.getCourseUnit();

		for (int i = 0; i < courseunit.length; i++) {
			if (i == 0) {
				System.out.println(courseunit[i]);
			} else {
				System.out.println("\t" + courseunit[i]);
			}

		}
	}


	/*
	 * ★ common.Courseを実装した、DBCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】DB基礎」
	 * 単元
	 * 		DB基礎
	 * 		SQL基礎
	 * 		正規化
	 * 		SQL応用
	 */

}
