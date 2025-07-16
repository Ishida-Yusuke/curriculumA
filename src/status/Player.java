package status;

public class Player extends CharacterStatus {
	private String name;
	//コンストラクタ８（名前を受け取る）
	public Player(String name) {
		super();//CharacterStatusのコンストラクタを呼ぶ
		this.name = name;
	}
	//getter
	public String getName() {
		return name;
	}
    //setter
	public void setName(String name) {
		this.name = name;
	}
}
