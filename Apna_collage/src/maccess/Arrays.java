package maccess;
import java.util.*;
public class Arrays {
	public static void main(String args []) {
      Scanner s = new Scanner(System.in);
		//int[] marks= {97,98,99,100,101};
		//marks[0]=97;
		//marks[1]=98;
		//marks[2]=99;
		//System.out.println(marks[0]);
		//System.out.println(marks[1]);
		//System.out.println(marks[2]);
	//} 
      int size =s.nextInt();
      int numbers[] = new int[size];
      
      for(int i=0;i<size;i++) {
    	  numbers[i]= s.nextInt();
      }
      
      int x = s.nextInt();
      
	for(int i=0;i<numbers.length;i++) {
		if(numbers[i] == x ) {
			System.out.println("x found at index :"+ i);
		}
	}
	}

}
