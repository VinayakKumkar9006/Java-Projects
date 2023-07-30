package macccss;
import java.util.*;
import test.*;
public class DemoRef3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		Writer wr = new Writer(sb);
		Reader rd = new Reader(sb);
	    wr.write(s);//Scanner s is paameter
	    rd.read();
        s.close();
	}

}
