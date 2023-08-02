package encapsulation;

public class B {

	public static void main(String[] args) {
		A a1=new A(10);
		int v=a1.getvalue();
		System.out.println(v);
		a1.setvalue(20);
		System.out.println(a1.getvalue());
	}

}
