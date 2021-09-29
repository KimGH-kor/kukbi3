package ch04;

import java.util.StringTokenizer;

public class ProgramingL {
	static int count = 0;//인덱스
	public static void main(String[] args) {
		String a = "c++ C++, Java JavA(python)";
		String n = a.toLowerCase();//소문자로

		
		
		StringTokenizer st = new StringTokenizer(n," ,()?/-");//예외설정
		
		program[] arr = new program[10];//클래스로 배열
		
		
		
		
		
		
		
		while(st.hasMoreTokens()) {//자른 갯수만큼 돌린다.
			String str = st.nextToken();//처음꺼 받아오고
			add(arr,str);//add메서드 실행
		}
		
		showInfo(arr, count);
		
		
	}
	
	static void showInfo(program[] arr, int count) {//출력하기
		for(int i = 0; i < count; i++) {
			System.out.println(arr[i].name+"  "+arr[i].cnt);
		}
	}
	
	static void add(program[] arr, String str) {//배열과 비교할 값과 인덱스 받아옴
		int save = -1;//같은 이름이 있다면 몇번째 위치인지 파악
		
		if(count != 0) {//인덱스가 0이라면 실행 안함
			for(int i = 0; i < count; i++) {//인덱스수 만큼 실행
					if(arr[i].getName().equals(str)) {//만약 같은 이름인게 있다면 
						save = i;//위치 파악
						break;
					}
				}
			}
		
		if(save != -1){//-1이 바뀌었다면
			arr[save].setCnt(arr[save].getCnt()+1);//그 위치에 있는 값을 +1한다
		}else {
			arr[count++] = new program(str, 1);//같은 이름이 없다면 그 위치에 새로운 객체 생성
		}
	}
	
}
class program{
	String name;
	int cnt;
	
	public program(String name, int cnt) {
		this.name = name;
		this.cnt = cnt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
}