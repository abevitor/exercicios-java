import java.util.*;
public class TwoDarrayList {
	
	public static void main(String[]args) {
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("Pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("Donuts");
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");
		
		ArrayList<String> drinkList = new ArrayList();
		drinkList.add("juice");
		drinkList.add("coffe");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinkList);
		

		
		System.out.println(groceryList.get(1).get(2));

}
	
}

