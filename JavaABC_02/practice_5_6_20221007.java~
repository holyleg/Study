class Weapon{
	protected int fire()
	{
		System.out.println("11111111111111111111");

		return 1;
	}
}

class Cannon extends Weapon{
	@Override
	protected int fire()
	{
		System.out.println("2222222222222");
		return 10;
	}
}

public class practice_5_6_20221007{
	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("기본 무기의 살상 능력은 " + weapon.fire());
		weapon = new Cannon();
		System.out.println("대포의 살상능력은 " + weapon.fire());
	}
}
