package gettersAndSetter;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
				
		ArrayList<Integer> numberList = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			numberList.add(i);
		}
		
		System.out.println(numberList.size());
		System.out.println(numberList);
		
		ArrayList<CoolClass> coolList = new ArrayList<>();
		
		for (int i = 0; i < 3; i++) {
			CoolClass coolClass = new CoolClass(i *2, "LOL" + i);
			coolList.add(coolClass);
		}
		
		System.out.println(coolList);

	}

}
