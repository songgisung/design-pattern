import charactor.GameCharactor;
import weapon.Ax;
import weapon.Knife;
import weapon.Sword;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameCharactor charactor =  new GameCharactor();
		
		charactor.attack();
		
		charactor.setWeapon(new Knife());
		charactor.attack();
		
		charactor.setWeapon(new Sword());
		charactor.attack();
		
		charactor.setWeapon(new Ax());
		charactor.attack();
	}

}
