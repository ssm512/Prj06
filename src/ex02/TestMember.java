package ex02;

import java.util.Objects;

class Member {
	// Feild
	int			id;
	String		name;
	
	// Constructor
	// 기본생성자
	public Member() {} // 기본 생성자 end
	
	// 인자있는 생성자
	public Member(int id, String name) {
		this.id		=	id;
		this.name	=	name;
	} // Memeber Constructor end
	

	// Method
	void	disp() {
		System.out.println(id + " " + name); 
	} // disp() end

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	// method
	// @Override - annotation (컴파일러한테 '재정의한거야' 라고 알려주는 거임)
	
	// Object 의 equals() 를 재정의
	@Override
	public boolean equals(Object obj) { // 모든 객체의 부모는 Object 즉, 무엇이든 받을수 있다는 뜻
		if (this == obj)	//	heap 주소 같은 비교
			return true;
		if (obj == null)	// new Member() 를 쓰지 않으면, stack에 인스턴스는 만들어지지만 heap에 객체는 만들어지지 않음 그래서 null
			return false;
		if (getClass() != obj.getClass()) // type 같아야 비교 할 수 있음
			return false;
		Member other = (Member) obj; // obj를 Member type으로 형변환
		return id == other.id && Objects.equals(name, other.name);
	}

	// debugging을 위한 것
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	} // toString() end
		
	// 내가 새로 만든 equals() <- Object를 재정의한 것이 아니다
	/*
	@Override 를 붙이면 error 
	boolean equals (Member m) {
		boolean result	=	false;
		
		if (this.id == m.id ) {
			if (this.name.equals(m.name)) {
				result	=	true;
			} // name 비교
		} // id 비교
		return result;
	} //equals () end
	 */	
	
	
} // class Member end

public class TestMember {

	public static void main(String[] args) {
		Member		m1		=	new	Member();
		m1.id				=	1;
		m1.name				=	"단종";
		m1.disp();
		
		System.out.println(m1); 			// ex02.Member@18b4aac2	// m1 과 m1.toString() 은 같다 // 이런 경우가 많은 이를 대비해서 hashCode() 함수가 있는거임
		System.out.println(m1.toString()); 	// ex02.Member@18b4aac2 // package이름.class이름@stack에 있는 heap메모리주소
		
		Member		m2		=	new	Member(2, "엄홍도");
		m2.disp();
		System.out.println(m2);				//ex02.Member@764c12b6
		System.out.println(m2.toString());	//ex02.Member@764c12b6
		
		System.out.println(m1 == m2);	// false
		
		Member		m3		=	new	Member(1, "단종");
		System.out.println(m3);				//ex02.Member@c387f44
		System.out.println(m1 == m3);	// false
		System.out.println();
		
		// 객체를 비교하여 주소가 아니라 내용을 비교하는 방법 : equals
		// m1.equals(m3) 는 주소비교이다. -> 내용비교를 위해 기능을 수정해야 한다
		System.out.println(m1.equals(m3));	// false
		
		
		
		
	} // main end

} // class end
