package status;

import java.util.Random;

public class CharacterStatus {
	private int hp;//外から触れないようにする
	private int mp;
	private int attack;
	private int speed;
	private int defense;
	//コンストラクタでランダムに初期化
	public CharacterStatus() {
		Random rand = new Random();
		this.hp = rand.nextInt(1000);//0~999のHP
		this.mp = rand.nextInt(1000);//0~999のMP
		this.attack = rand.nextInt(500);//0~499の攻撃力
		this.speed = rand.nextInt(1000);//0~999の素早さ
		this.defense = rand.nextInt(100);//0~99の防御力
	}
	//getterとsetter
	public int getHp() { return hp; }
	public void setHp(int hp) { this.hp = hp; }
	
	public int getMp() { return mp; }
	public void setMp(int mp) { this.mp = mp; }
	
	public int getAttack() { return attack; }
	public void setAttack(int attack) { this.attack = attack; }
	
	public int getSpeed() { return speed; }
	public void setSpeed(int speed) { this.speed = speed; }
	
	public int getDefense() { return defense; }
	public void setDefense(int defense) { this.defense = defense; }

}
