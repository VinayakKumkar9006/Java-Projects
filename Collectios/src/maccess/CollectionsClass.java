package maccess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsClass {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Anuj",2));
		list.add(new Student("Ramesh",4));
		list.add(new Student("Shivam",3));
		list.add(new Student("Rohit", 5));
		
		
		Student s1 = new Student("Ranjit",2);
		Student s2 = new Student("anuj",3);
		
		//System.out.println(s1.compareTo(s2));
		System.out.println(list);
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				
				return o1.name.compareTo(o2.name);
			}	
		});
		
			
		
		System.out.println(list);
		
		/*List<Integer> list = new ArrayList<>();
		list.add(34);
		list.add(98);
		list.add(56);
		list.add(65);
		list.add(75);
		list.add(95);
		list.add(15);

		System.out.println("Min Element "+ Collections.min(list));
		System.out.println("Max Element "+Collections.max(list));
		System.out.println(Collections.frequency(list, 98));
		
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);*/
	}

}
