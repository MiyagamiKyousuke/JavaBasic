package practice13.common;

public class Employee extends Person{
	String name;
	int departmentCnt;
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return departmentCnt
	 */
	public int getDepartmentCnt() {
		return departmentCnt;
	}
	/**
	 * @param departmentCnt セットする departmentCnt
	 */
	public void setDepartmentCnt(int departmentCnt) {
		this.departmentCnt = departmentCnt;
	}
}
