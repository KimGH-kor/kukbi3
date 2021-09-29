package ch04;

interface Movable
{
	void Up();
	void Down();
	void Left();
	void Right();
}

interface Attackable
{
	void Attack(gObject ob);
}

interface Magical
{
	void Magic(gObject ob);
}

abstract class gObject
{
	final static int ALIVE = 1;
	final static int DEAD = 0;
	final static int WARRIOR = 10;
	final static int ARCHER = 11;
	final static int PRIEST = 12;
	final static int WIZARD = 13;
	final static int NOBICE = 14;
	String name;
	gObject(String name, int hp, int x, int y)
	{
		this.name = name; this.hp = hp; this.x = x; this.y = y;
	}
	int hp, x, y, state;
	gObject(String name, int hp, int x, int y, int state)
	{
		this.name = name; this.hp = hp; this.x = x; this.y = y; this.state = state;
	}
	void Show() {
		System.out.println("�̸� : "+name+" �� : "+hp+" ��ġx : "+x+	" ��ġy : "+y+" ���� : "+state);
	}
	void IncreaseHP(int n) {
		hp += n;
		if (n < 0) 
		{
			System.out.println(name + "�� " + n + "��ŭ ���ظ� �Ծ���");
		}
		else
		{
			System.out.println(name + "�� " + n + "��ŭ ȸ���Ǿ���");
		}
		
		
		if (hp < 0)
		{
			hp = 0;
			state = DEAD;
			System.out.println(name + "�� ����߽��ϴ�");
		}
	}

	int Distance(gObject ob) 
	{
		int d1 = x - ob.x;
		int d2 = y - ob.y;
		if (d1 < 0) d1 = -d1;
		if (d2 < 0) d2 = -d2;
		return d1 + d2;
	}
	
	boolean isDead() { 
		if (state == DEAD) 
			return true; 
		else 
			return false; 
	} 
	
	abstract void Reinforce();
}

class Academy extends gObject{
	
	Academy(String name, int hp, int x, int y) {
		super(name, hp, x, y);
		
	}
	public gObject CreateObject(int job, String name, int hp, int mp, int x, int y) {
		switch (job) {
		case 10: 
			return new Warrior(name, hp, x, y);
		case 11: 
			return new Archer(name, hp, x, y);
		case 12: 
			return new Priest(name, hp, mp, x, y);
		case 13: 
			return new Wizard(name, hp, mp, x, y);
		
		default:
			System.out.println("���� �����Դϴ�.");
			return null;
		}
	}
	@Override
	void Reinforce() {
		this.hp += 100;
	}
	
}



class Warrior extends gObject implements Attackable, Movable
{
	int damage, range;
	Warrior(String name, int hp, int x, int y) {
		super(name, hp, x, y, gObject.ALIVE);
		// TODO Auto-generated constructor stub
		damage = 30; range = 2;
	}
	@Override
	public void Attack(gObject ob) {
		// TODO Auto-generated method stub
		if (ob.isDead())
		{
			System.out.println(ob.name + "�� �̹� ����߽��ϴ�");
			return;
		}
		if (Distance(ob) <= range)
		{
			System.out.println(ob.name + "���� ���� �ֵѷ���");
			ob.IncreaseHP(-damage);	
		}
		else
		{
			System.out.println(ob.name + "�� �ʹ� �ָ��ֽ��ϴ�");
		}
	}
	@Override
	void Reinforce() {
		// TODO Auto-generated method stub
		damage += 10; hp += 30;
	}
	@Override
	public void Up() {
		// TODO Auto-generated method stub
		y-=3;
		System.out.println("���� ��ġ :"+this.x+","+this.y);
	}
	@Override
	public void Down() {
		// TODO Auto-generated method stub
		y+=3;
		System.out.println("���� ��ġ :"+this.x+","+this.y);
	}
	@Override
	public void Left() {
		// TODO Auto-generated method stub
		x-=3;
		System.out.println("���� ��ġ :"+this.x+","+this.y);
	}
	@Override
	public void Right() {
		// TODO Auto-generated method stub
		x+=3;
		System.out.println("���� ��ġ :"+this.x+","+this.y);
	}
	
}
class Archer extends gObject implements Attackable, Movable
{
	int damage, range;
	Archer(String name, int hp, int x, int y) {
		super(name, hp, x, y, gObject.ALIVE);
		// TODO Auto-generated constructor stub
		damage = 15; range = 10;
	}
	@Override
	public void Attack(gObject ob) {
		// TODO Auto-generated method stub
		if (ob.isDead())
		{
			System.out.println(ob.name + "�� �̹� ����߽��ϴ�");
			return;
		}
		if (Distance(ob) <= range)
		{
			System.out.println(ob.name + "���� Ȱ�� ��Ѵ�");
			ob.IncreaseHP(-damage);	
		}
		else
		{
			System.out.println(ob.name + "�� �ʹ� �ָ��ֽ��ϴ�");
		}
	}
	@Override
	void Reinforce() {
		// TODO Auto-generated method stub
		damage += 5; hp += 15;
	}
	@Override
	public void Up() {
		// TODO Auto-generated method stub
		y-=1;
		System.out.println("���� ��ġ :"+this.x+","+this.y);
	}
	@Override
	public void Down() {
		// TODO Auto-generated method stub
		y+=1;
		System.out.println("���� ��ġ :"+this.x+","+this.y);
	}
	@Override
	public void Left() {
		// TODO Auto-generated method stub
		x-=1;
		System.out.println("���� ��ġ :"+this.x+","+this.y);
	}
	@Override
	public void Right() {
		// TODO Auto-generated method stub
		x+=1;
		System.out.println("���� ��ġ :"+this.x+","+this.y);
	}
	
}
class Priest extends gObject implements Movable, Magical
{
	int range, mp, mentality;
	Priest(String name, int hp, int mp, int x, int y) {
		super(name, hp, x, y, gObject.ALIVE);
		// TODO Auto-generated constructor stub
		this.mp = mp;
		range = 5;
		mentality = 20;
	}
	@Override
	public void Magic(gObject ob) {
		// TODO Auto-generated method stub
		if (ob.isDead())
		{
			System.out.println(ob.name + "�� �̹� ����߽��ϴ�");
			return;
		}
		if(this.mp >= 10) {
		if (Distance(ob) <= range)
		{
			System.out.println(ob.name + "���� ������ ����ߴ�.");
			ob.IncreaseHP(mentality);
			this.mp -= 10;
		}
		else
		{
			System.out.println(ob.name + "�� �ʹ� �ָ��ֽ��ϴ�");
		}
		}else {
			System.out.println("������ �����մϴ�.");
		}
	}
	@Override
	void Reinforce() {
		// TODO Auto-generated method stub
		mentality += 3; mp +=50; hp += 30;
	}
	@Override
	public void Up() {
		// TODO Auto-generated method stub
		y-=2;
		System.out.println("���� ��ġ :"+this.x+","+this.y);
	}
	@Override
	public void Down() {
		// TODO Auto-generated method stub
		y+=2;
		System.out.println("���� ��ġ :"+this.x+","+this.y);
	}
	@Override
	public void Left() {
		// TODO Auto-generated method stub
		x-=2;
		System.out.println("���� ��ġ :"+this.x+","+this.y);
	}
	@Override
	public void Right() {
		// TODO Auto-generated method stub
		x+=2;
		System.out.println("���� ��ġ :"+this.x+","+this.y);
	}
	
}
class Wizard extends gObject implements Magical, Movable, Attackable
{
	int damage, range, mentality, mp;
	Wizard(String name, int hp,int mp, int x, int y) {
		super(name, hp, x, y, gObject.ALIVE);
		// TODO Auto-generated constructor stub
		this.mp = mp;
		damage = 5; range = 5; mentality = 50;
	}
	@Override
	public void Magic(gObject ob) {
		// TODO Auto-generated method stub
		if (ob.isDead())
		{
			System.out.println(ob.name + "�� �̹� ����߽��ϴ�");
			return;
		}
		if(this.mp >= 10) {
		if (Distance(ob) <= range)
		{
			System.out.println(ob.name + "���� ������ ����ߴ�.");
			int d = (int)(ob.hp * mentality * 0.01);
			ob.IncreaseHP(-d);	
			this.mentality -= 10;
		}
		else
		{
			System.out.println(ob.name + "�� �ʹ� �ָ��ֽ��ϴ�");
		}
	}else {
		System.out.println("������ �����մϴ�.");
	}
	}
	@Override
	public void Attack(gObject ob) {
		if(ob.isDead()) {
			System.out.println(ob.name+"�� �̹� ����߽��ϴ�.");
			return;
		}

		if(Distance(ob)<=range) {
			System.out.println(ob.name + "���� ���� �ֵѷ���.");
			ob.IncreaseHP(-damage);
		}else {
			System.out.println(ob.name + "�� �ʹ� �ָ��ֽ��ϴ�.");
		}
	}
	
	@Override
	void Reinforce() {
		// TODO Auto-generated method stub
		mp += 50; hp += 10; mentality +=5;
	}
	@Override
	public void Up() {
		// TODO Auto-generated method stub
		y-=1;
		System.out.println("���� ��ġ :"+this.x+","+this.y);
	}
	@Override
	public void Down() {
		// TODO Auto-generated method stub
		y+=1;
		System.out.println("���� ��ġ :"+this.x+","+this.y);
	}
	@Override
	public void Left() {
		// TODO Auto-generated method stub
		x-=1;
		System.out.println("���� ��ġ :"+this.x+","+this.y);
	}
	@Override
	public void Right() {
		// TODO Auto-generated method stub
		x+=1;
		System.out.println("���� ��ġ :"+this.x+","+this.y);
	}

}

public class acc {
	
	public static void main(String[] args) {
		Academy a = new Academy("���谡 �Ʒü�", 1500, 50, 50);
		Warrior w4 = (Warrior) a.CreateObject(gObject.WARRIOR, "���ĥ", 100, 50, 50, 50);
		
		Warrior w1 = new Warrior("�����", 100, 5, 5);
		Warrior w2 = new Warrior("ȫ�浿", 100, 10, 5);
		Archer a1 = new Archer("������", 100, 3, 0);
		Priest p1 = new Priest("���ѿ�", 100, 50, 1, 1);
		Wizard wi1 = new Wizard("���ȯ", 100, 50, 1, 1);
		w1.Attack(w2);
		w2.Left(); w2.Left();
		w1.Attack(w2);
		w1.Attack(w2);
		w1.Attack(w2);
		w1.Attack(w2);
		w1.Attack(w2);
		w1.Attack(w2);
		p1.Right();
		a1.Left();
		wi1.Show();
		p1.Show();
		wi1.Attack(p1);
		wi1.Attack(p1);
		wi1.Attack(p1);

		wi1.Reinforce();
		wi1.Magic(p1);
		p1.Show();
		p1.Magic(p1);
		p1.Show();
		wi1.Magic(a1);
		wi1.Magic(a1);
		a1.Show();
		wi1.Attack(a1);
		wi1.Attack(a1);
		wi1.Attack(a1);
		wi1.Attack(a1);
		wi1.Attack(a1);
		wi1.Attack(a1);
		wi1.Attack(a1);
		p1.Magic(a1);
		a1.Show();
	}

}
