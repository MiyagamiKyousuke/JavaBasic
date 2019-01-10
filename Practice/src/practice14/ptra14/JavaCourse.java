package practice14.ptra14;

import practice14.common.Course;

public class JavaCourse implements Course{

	@Override
	public String getCourseName() {
		// TODO 自動生成されたメソッド・スタブ
		String[] unit = new String[2];
		String course;
		StringBuilder chars = new StringBuilder();
		unit[0] = "コース名称";
		unit[1] = PREFIX + " Java";

		for(int i = 0; i < unit.length; i++) {
			chars.append(unit[i] +",");
		}
		course = chars.toString();


		return course;
	}

	@Override
	public String[] getCourseUnit() {
		// TODO 自動生成されたメソッド・スタブ
		String[] unit = new String[8];

		unit[0] = "単元";
		unit[1] = "式と演算";
		unit[2] = "制御構文";
		unit[3] = "メソッド";
		unit[4] = "配列";
		unit[5] = "オブジェクト指向";
		unit[6] = "継承";
		unit[7] = "高度な継承";


		return unit;
	}



}
