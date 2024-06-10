import java.util.ArrayList;

public class ForLoopEach {
	
	public static void main(String[]args) {
		
		//String[] animals = {"cat","dog","rat","bird"};
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("cat");
		animals.add("dog");
		animals.add("rat");
		animals.add("eagle");
		animals.add("shark");
		
		for(String i : animals) { 
			System.out.println(i);
			
		}
	}

}
