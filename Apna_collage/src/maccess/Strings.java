package maccess;
public class Strings {
	public static void main(String[] args) {
	StringBuilder sb = new StringBuilder("Tony");
    System.out.println(sb);
    
   System.out.println(sb.charAt(0));
   
   //set char at index 0
     sb.setCharAt(0, 't');
     System.out.println(sb);
     // 
     System.out.println(sb.insert(2, 'n'));
     
     //delete the extra 'n'
     sb.delete(2, 4);
     System.out.println(sb.length());
	}
}