package ch10.스레드연습;

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
				System.out.println(name + "은 " + n + "만큼 피해를 입었다");
			}
			else
			{
				System.out.println(name + "은 " + n + "만큼 회복되었다");
			}
			
			
			if (hp < 0)
			{
				hp = 0;
				state = DEAD;
				System.out.println(name + "은 사망했습니다");
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
					//대기중
					break;
				case ATTACK : 
					while(true)
					{
						if(this.isDead())
						{
							cmd = STOP;
							break;
						}
						
						if(Distance(Target) > range) //타겟이 사거리 밖에 있다.
						{
							if (Target.x > x)// 타겟이 오른쪽에 있다.
							{
								Right();
							}
							else if(Target.x < x) // 타겟이 왼쪽에 있다.
							{
								Left();
							}
							
							if (Target.y > y)// 타겟이 아래에 있다.
							{
								Down();
							}
							else if(Target.y < y) // 타겟이 위에 있다.
							{
								Up();
							}
							try {
								Thread.sleep(mSpeed);//1초에 한번 이동
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
								Thread.sleep(aSpeed); // 전사의 공격속도
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
					
					
					break;
				}
				
				try {
					Thread.sleep(10); //스래드 동작속도
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
				System.out.println(ob.name + "는 이미 사망했습니다");
				return;
			}
			if (Distance(ob) <= range)
			{
				System.out.println(ob.name + "에게 검을 휘둘렀다");
				ob.IncreaseHP(-damage);	
			}
			else
			{
				System.out.println(ob.name + "가 너무 멀리있습니다");
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
			System.out.println(name + "이 위로 3만큼 이동했습니다");
		}
		@Override
		public void Down() {
			// TODO Auto-generated method stub
			y+=3;
			System.out.println(name + "이 아래로 3만큼 이동했습니다");
		}
		@Override
		public void Left() {
			// TODO Auto-generated method stub
			x-=3;
			System.out.println(name + "이 왼쪽으로 3만큼 이동했습니다");
		}
		@Override
		public void Right() {
			// TODO Auto-generated method stub
			x+=3;
			System.out.println(name + "이 오른쪽으로 3만큼 이동했습니다");
		}
		
	}

	public class acc {
		
		public static void main(String[] args) {
		
			Warrior w1 = new Warrior("장용훈", 100, 5, 5);
			Warrior w2 = new Warrior("홍길동", 100, 50, 50);
			w1.start();
			w2.start();
			w1.SetCommand(Warrior.ATTACK, w2);
			w2.SetCommand(Warrior.ATTACK, w1);
		}
	}

