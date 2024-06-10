import java.util.ArrayList;

public class ListArray {
	
public static void main(String[] args) {
		
		ArrayList<String>  food = new ArrayList<String>();
		
		food.add("Pizza");
		food.add("Sushi");
		food.add("Hamburgerr");
		
		food.set(0, "sushi");
		food.remove(1);
		food.clear();
		
		for(int i =0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
			
	}

}
