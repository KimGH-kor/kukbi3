package ch10.�����忬��;

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

	abstract class gObject extends Thread
	{
		final static int ALIVE = 1;
		final static int DEAD = 0;
		final static int WARRIOR = 10;
		final static int ARCHER = 11;
		final static int PRIEST = 12;
		final static int WIZARD = 13;
		
		String name;
		int hp, x, y, state;
		gObject(String name, int hp, int x, int y, int state)
		{
			this.name = name; this.hp = hp; this.x = x; this.y = y; this.state = state;
		}
		void Show() {}
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


	class Warrior extends gObject implements Attackable, Movable
	{
		static final int STOP = 0;
		static final int ATTACK = 1;
		int damage, range;
		int cmd;
		int mSpeed, aSpeed;
		gObject Target;
		Warrior(String name, int hp, int x, int y) {
			super(name, hp, x, y, gObject.ALIVE);
			// TODO Auto-generated constructor stub
			damage = 30; range = 2; cmd = STOP; 
			mSpeed = 1000;
			aSpeed = 2000;
		}
		
		
		public void SetCommand(int cmd, gObject Target)
		{
			this.cmd = cmd;
			this.Target = Target;
			//this.notify();
		}
		
		
		public void run()
		{
			
			while(true)
			{	
				switch(cmd)
				{
				case STOP : 
					//�����
					break;
				case ATTACK : 
					while(true)
					{
						if(this.isDead())
						{
							cmd = STOP;
							break;
						}
						
						if(Distance(Target) > range) //Ÿ���� ��Ÿ� �ۿ� �ִ�.
						{
							if (Target.x > x)// Ÿ���� �����ʿ� �ִ�.
							{
								Right();
							}
							else if(Target.x < x) // Ÿ���� ���ʿ� �ִ�.
							{
								Left();
							}
							
							if (Target.y > y)// Ÿ���� �Ʒ��� �ִ�.
							{
								Down();
							}
							else if(Target.y < y) // Ÿ���� ���� �ִ�.
							{
								Up();
							}
							try {
								Thread.sleep(mSpeed);//1�ʿ� �ѹ� �̵�
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						else
						{
							if(Target.isDead())
							{
								cmd = STOP;
								break;
							}
							synchronized(Target)
							{
								Attack(Target);
							}
							try {
								Thread.sleep(aSpeed); // ������ ���ݼӵ�
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
					
					
					break;
				}
				
				try {
					Thread.sleep(10); //������ ���ۼӵ�
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
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
			System.out.println(name + "�� ���� 3��ŭ �̵��߽��ϴ�");
		}
		@Override
		public void Down() {
			// TODO Auto-generated method stub
			y+=3;
			System.out.println(name + "�� �Ʒ��� 3��ŭ �̵��߽��ϴ�");
		}
		@Override
		public void Left() {
			// TODO Auto-generated method stub
			x-=3;
			System.out.println(name + "�� �������� 3��ŭ �̵��߽��ϴ�");
		}
		@Override
		public void Right() {
			// TODO Auto-generated method stub
			x+=3;
			System.out.println(name + "�� ���������� 3��ŭ �̵��߽��ϴ�");
		}
		
	}

	public class acc {
		
		public static void main(String[] args) {
		
			Warrior w1 = new Warrior("�����", 100, 5, 5);
			Warrior w2 = new Warrior("ȫ�浿", 100, 50, 50);
			w1.start();
			w2.start();
			w1.SetCommand(Warrior.ATTACK, w2);
			w2.SetCommand(Warrior.ATTACK, w1);
		}
	}

