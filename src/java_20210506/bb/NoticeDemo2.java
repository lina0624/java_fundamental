package java_20210506.bb;
import java_20210506.aa.Notice;
public class NoticeDemo2 extends Notice{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//서로 다른 패키지의 클래스를 사용하기 위해서는 
		//import 구문을 사용해야 한다.
		//package => import => class 순으로 코딩해야 한다.
		Notice n = new Notice();
		n.number = 1;  //public 서로 다른 패키지에서도 접근 가능
		//n.title = ""; //protected 서로 다른 패키지에서 접근하려면 상속받은 경우만 가능
		//n.hit = 0; //default 서로 다른 패키지에서 접근 불가능
		//n.regdate = ""; //private 서로 다른 패키지에서 접근 불가능
		
		NoticeDemo2 n2 = new NoticeDemo2();
		n2.number = 2; //public 서로 다른 패키지에서 접근 가능
		n2.title = ""; //protected 서로 다른 패키지에서 접근하려면 상속받은 경우만 가능
		//n2.hit = 0;
		//n2.regdate = "";
		
		//상속받은 경우, 부모꺼도 내꺼, 내꺼도 내꺼 (여기서 Notice가 부모이고, NoticeDemo2가 자식)
		
		
	}

}
