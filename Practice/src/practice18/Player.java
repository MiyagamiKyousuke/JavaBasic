package practice18;

public class Player {
	private String position;
	private String name;
	private String country;
	private String team;

	@Override
	public String toString() {
		// TODO 自動生成されたメソッド・スタブ
		return position+","+name+","+country+","+team;
	}
	/**
	 * @return position
	 */
	public String getPosition() {
		return position;
	}
	/**
	 * @param position セットする position
	 */
	public void setPosition(String position) {
		this.position = position;
	}
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
	 * @return country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country セットする country
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return team
	 */
	public String getTeam() {
		return team;
	}
	/**
	 * @param team セットする team
	 */
	public void setTeam(String team) {
		this.team = team;
	}

}
