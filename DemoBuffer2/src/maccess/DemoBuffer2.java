package maccess;
import java.util.*;
public class DemoBuffer2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(4);
		System.out.println("Default Capacity:"+sb.capacity());
		System.out.println("Length:"+sb.length());
		System.out.println("Data in Sb:"+sb.toString());
		sb.append("Program");
		System.out.println("Capacity:"+sb.capacity());
	    System.out.println("Length:"+sb.length());
	    System.out.println("Data in Sb:"+sb.toString());
        s.close();
	}

}
