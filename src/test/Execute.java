package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Execute {
	
	public static void main(String[] args) {
		List<Person> pList = new ArrayList<>();
		pList.add(new Person("그냥",22,80));
		pList.add(new Person("아무",34,94));
		pList.add(new Person("거나",46,68));
		Collections.sort(pList);
		System.out.print(pList);
	}

}
