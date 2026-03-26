package ex03;

class Member {
	// Field
	int					id;
	String				name;
	String				email;
	
	// Constructor
	public Member () {}
	public Member (String msg) {
		System.out.println(msg + "객체 생성");
	} // 
	public Member(int id, String name, String email) {
		this("msg");			// 기본생성자 Member()를 호출하였다 , this : 나 자신
		//super();		// super : 부모클래스 -> parent, super() : 부모클래스 기본생성자 호출하라
		this.id = id;
		this.name = name;
		this.email = email;
	} // Member constructor end
	
	
	
	// override methods
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	
	
} // class Member end

public class TestMember {

	public static void main(String[] args) {
		Member		m1		=	new	Member();
		m1.id				=	1;
		m1.name				=	"박찬호";
		m1.email			=	"park@pch.com";
		System.out.println(m1);
		
		Member		m2		=	new Member(2,"강호동","kang@khd.com");
		System.out.println(m2);

	} // main end

} // class TestMember end
