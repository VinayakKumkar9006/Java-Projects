package maccess;

public class DemoString11 {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "Language";
		String s3 = "Program";
		String s4 = s1+s2+s3;
		System.out.println("S4: "+s4);
		String s5 =s1.concat(s2);
		System.out.println("S5: "+s5.toString());
		String s6 = s1.concat(s2).concat(s3);
		System.out.println("S6: "+s6.toString());
				

	}

}
