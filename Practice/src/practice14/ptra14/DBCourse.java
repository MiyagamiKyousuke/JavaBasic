package practice14.ptra14;

import practice14.common.Course;

public class DBCourse implements Course{

	@Override
	public String getCourseName() {
		// TODO 自動生成されたメソッド・スタブ
		String[] unit = new String[2];
		String course;
		StringBuilder chars = new StringBuilder();
		unit[0] = "コース名称";
		unit[1] = PREFIX + " DB基礎";

		for(int i = 0; i < unit.length; i++) {
			chars.append(unit[i] +",");
		}
		course = chars.toString();
		return course;
	}

	@Override
	public String[] getCourseUnit() {
		// TODO 自動生成されたメソッド・スタブ
		String[] unit = new String[5];

		unit[0] = "単元";
		unit[1] = "DB基礎";
		unit[2] = "SQL基礎";
		unit[3] = "正規化";
		unit[4] = "SQL応用";
		return unit;
	}

}
