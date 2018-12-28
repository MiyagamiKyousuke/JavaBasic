package practice13.common;

/*
 * ★ common.Heroクラスを継承した、common.SuperHeroクラスを作成してください
 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
 *
 * フィールド
 * 		equipment	:	common.Item
 * メソッド
 * 		attackメソッドをオーバーライドし、
 * 		powerに加えて、additionalDamage分を加算した値としてください
 *
 * 		equipmentのアクセサ
 */
public class SuperHero extends Hero{
	Item equipment;


	public int attack() {
		return super.attack() + this.equipment.getAdditionalDamage();
	}


	/**
	 * @return equipment
	 */
	public Item getEquipment() {
		return equipment;
	}

	/**
	 * @param equipment セットする equipment
	 */
	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}




}
