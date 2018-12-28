package practice13.common;

public class Item {
	String name;
	int additionalDamage;




	public Item(String name,int additionalDamage) {
		this.name = name;
		this.additionalDamage = additionalDamage;
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
	 * @return additionalDamage
	 */
	public int getAdditionalDamage() {
		return additionalDamage;
	}
	/**
	 * @param additionalDamage セットする additionalDamage
	 */
	public void setAdditionalDamage(int additionalDamage) {
		this.additionalDamage = additionalDamage;
	}
}

