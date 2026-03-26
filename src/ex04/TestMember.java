package ex04;

class Member {
	// field 
	// access modifier(public, private, protected, package) 안 붙이면 package level 이다. 
	// package level 변수, 같은 폴더에서 변수 공유됨
	// field는 전부 private
	private	int					id;		// private 붙여주니까 main 내부의 m1.id~.email 에서 not visible error뜸
	private	String				name;
	private	String				email;
	
	// constructor
	public Member() {}
	
	public Member(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	// toString method
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	// Setter 함수 : 외부 class에서 내부 field에 값을 넣는 방법
	// Getter 함수 : 외부 class로 내부 field의 값을 넣는 방법
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
	
} // class Member end

public class TestMember {

	public static void main(String[] args) {
		
		Member		m1		=	new	Member();
		m1.setId(1);
		m1.setName("박찬호");
		m1.setEmail("park@pch.com");
		System.out.println(m1);
		String		name1	=	m1.getName();
		System.out.println("m1의 이름 : " + name1);
		
		Member		m2		=	new Member(2,"강호동","kang@khd.com");
		System.out.println(m2);
		m2.setEmail("kang@lg.com");
		// m2.email		=	"kang@lg.com";		//	error : not visible 
		System.out.println(m2);
		System.out.println("m2의 아이디:" 	+ 		m2.getId());
		System.out.println("m2의 이름:" 	+ 		m2.getName());
		System.out.println("m2의 이메일:" 	+ 		m2.getEmail());


	} // main end

} // class TestMember end
