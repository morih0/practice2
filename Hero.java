public class Hero extends Character{
	public void attack(Monster m){
		System.out.println("勇者" + getName() + "の攻撃");
		m += 10;
		System.out.println("敵に10ポイントのダメージ");
	}
}
