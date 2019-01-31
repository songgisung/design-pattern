package charactor;
import weapon.Weapon;

public class GameCharactor {
	
	//접근점
	private Weapon weapon;
		
	//교환 가
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		if(weapon == null) {
			System.out.println("素手攻撃");
		}else {
			weapon.attack();
		}
	}
}
