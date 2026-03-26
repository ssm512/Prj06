package ex01;
/*
num,name,kor,eng,mat
번호,이름,국어,영어,수학
1,사나,70,80,90
2,모모,0,70,100
3,쯔위,70,90,90
4,정연,80,90,70
5,원영,90,90,89
6,유진,100,100,100
*/
class Score {
//입력:번호,이름,국어,영어,수학
//		num, name, kor, eng, mat
//출력:번호 이름 국어 영어 수학 총점 평균 등급
//		num, name, kor, eng, mat, tot, avg, grade
	
	// Field
	// 입력 num, name, kor, eng, mat
	int			num;
	String		name;
	int			kor;
	int			eng;
	int			mat;
	// 출력 tot, avg, grade
	int			tot;
	double		avg;
	char		grade;
	
	// Constructor
	// sts에서 오른쪽 마우스 클릭 -> source -> generate constructor using Feild 
	// 단축키 : alt + shift + s 
	public Score(int num, String name, int kor, int eng, int mat) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		// 계산
		getTot();
		getAverage();
		getGrade();
		
		
	} // Score () 입력 end
	
	private void getTot() { // void는 이퀼문에 쓸수 없다
		this.tot		=	this.kor + this.eng + this.mat;		
	} // getTot() end


	private void getAverage() {
		this.avg		=	(this.kor + this.eng + this.mat) / 3.0 ;
	} // getAverage() end
	
	// ctrl + shift + p -> 대응하는 중괄호{} 찾는 단축키
	
	private void getGrade() {
		
		int		v	= (int)this.avg / 10; // 밑의 이유 떄문에 이 계산이 들어감
		switch (v) { // ()안에 정수, 문자열만 들어가야 함
		case 	10: // case 10이랑 9랑 결과값이 같으므로 this.grade ~~ 삭제함
		case 	9: 	this.grade	=	'A'; break;
		case 	8: 	this.grade	=	'B'; break;
		case 	7: 	this.grade	=	'C'; break;
		case 	6: 	this.grade	=	'D'; break;
		default	: 	this.grade	=	'F'; break;		
		}
		
		/* getGrade if문 구현
		if (this.avg >=90 && this.avg<=100) {
			this.grade = 'A';
			}
		if (this.avg >=80 && this.avg<90) {
			this.grade = 'B';
			}
		if (this.avg >=70 && this.avg<80) {
			this.grade = 'C';
			}
		if (this.avg >=60 && this.avg<70) {
			this.grade = 'D';
			}
		if (this.avg >=0 && this.avg<60) {
			this.grade = 'F';
			}
			*/ 
	} //getGrade() end
 


	// Method
	static void		title () { // static의 의미
		String		title		=	"번호 이름 국어 영어 수학 총점 평균 등급";
		System.out.println(title);
		
	} // title () end
	
	void		disp() {
		String		fmt			=	"%d   %s   %d   %d    %d   %d   %.2f  %c\n";
		System.out.printf		(fmt, num, name, kor, eng, mat, tot, avg, grade);
	} // disp() end
	
	
	
} // class Score end




public class TestScore {

	public static void main(String[] args) {
		
		//Score	sc1		=	new	Score(); // error : The constructor Score() is undefined
		// 기본 생성자가 없고 다른(인자있는) 생성자만 존재할때 new	Score(); 에러
		Score.title();

		Score			sc1			=	new	Score(1,"사나",70,80,90);
		sc1.disp();
		Score			sc2			=	new	Score(2,"모모",0,70,100);
		sc2.disp();
		Score			sc3			=	new	Score(3,"쯔위",70,90,90);
		sc3.disp();
		Score			sc4			=	new	Score(4,"정연",80,90,70);
		sc4.disp();
		Score			sc5			=	new	Score(5,"원영",90,90,89);
		sc5.disp();
		Score			sc6			=	new	Score(6,"유진",100,100,100);
		sc6.disp();
		
	} // main end

} // class TestScore end
