package ex05;
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
//입력:번호,이름,국어,영어,수학
//출력:번호 이름 국어 영어 수학 총점 등급
// 모든 field는 private으로
// 생성자, getter, setter, toString 만들어서 작업

class Score {
	// field
	// 입력
	private int			num;
	private	String		name;
	private	int			kor;
	private	int			eng;
	private	int			mat;
	// 출력
	private	int			tot;
	private	double		avg;
	private	char		grade;
	
	// constructor
	public Score () {}
	
	public Score(int num, String name, int kor, int eng, int mat) {
		this();
		this.num		=	num;
		this.name		=	name;
		this.kor		=	kor;
		this.eng		=	eng;
		this.mat		=	mat;
		getTot();
		getAvg();
		getGrade();
				
	}

	// method

	//toString 
	@Override
	public String toString() {
		return "Score [num=" + num + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", tot="
				+ tot + ", avg=" + avg + ", grade=" + grade + "]";
	}
	
	// getter, setter 
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
		getTot();
		getAvg();
		getGrade();
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
		getTot();
		getAvg();
		getGrade();
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
		getTot();
		getAvg();
		getGrade();
	}
	/*
	이때 constructor 에서는
	this.tot = getTot(); 로 해야됨
	private int getTot() {
		return	kor + eng + mat;
	}
	private double getAvg() {
		return	(kor + eng + mat)/3.0;
	}
	*/
	
	public void getTot() {
		this.tot	=	this.kor + this.eng + this.mat;
	}
	public void getAvg() {
		this.avg	=	this.tot / 3.0 ;
	}

	public void getGrade() {
		/* 1. if절 */
		if (avg >= 90 && avg <= 100) {
			this.grade	=	'A';
		} else { 
			if (avg >= 80 && avg < 90) {
				this.grade	=	'B';	
			} else {
				if (avg >= 70 && avg <80) {
					this.grade	=	'C';
				} else {
					if (avg >=60 && avg <70) {
						this.grade	=	'D';
					} else {
						this.grade	=	'F';
					} // 'd'의 else
				} // 'c'의 else
				
			} // 'b'의 else
			
		} // 90~100 A의 else
		
	} // getGrade() end

	public static void Title() {
		String		title	=	"번호 이름 국어 영어 수학 총점 평균 등급";
		System.out.println(title);
	} // title () end
	public void disp() {
		String		fmt		=	"%d    %s %d  %d  %d  %d  %.2f  %c\n";
		System.out.printf(fmt, num, name, kor, eng, mat, tot, avg, grade);
	} // disp () 함수
	
	
	
} // class Score end


public class TestScore {

	public static void main(String[] args) {
		Score.Title();
		Score		sc1		=	new	Score (1,"사나",70,80,90);
		sc1.disp();
		//System.out.println(sc1.toString());
		Score		sc2		=	new	Score (2,"모모",0,70,100);
		sc2.disp();
		Score		sc3		=	new	Score (3,"쯔위",70,90,90);
		sc3.disp();
		//Score		sc4		=	new	Score (4,"정연",80,90,70);
		//sc4.disp();
		Score 	sc4		=	new	Score();
		sc4.setNum(4);
		sc4.setName("정연");
		sc4.setKor(80);
		sc4.setEng(90);
		sc4.setMat(70);
		sc4.disp();
		Score		sc5		=	new	Score (5,"원영",90,90,89);
		sc5.disp();
		Score		sc6		=	new	Score (6,"유진",100,100,100);
		sc6.disp();
		sc3.setKor(50);
		sc3.disp();
		sc2.setKor(100);
		sc2.disp();
		
		System.out.println("번호 : " + sc1.getNum());
		System.out.println("이름 : " + sc1.getName());

		
	} // main end

} // class TestScore end
