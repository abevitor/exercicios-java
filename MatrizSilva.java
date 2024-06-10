
public class MatrizSilva {
	public static void main(String[]args) {
		
		String[][] cars = {
				{"Camaro","Corvette","Silverado"},
				{"Fit", "Mustang","Ranger"},
				{"Civic","Gtr","Tesla"}
				           };
		
		
		for(int i=0; i<cars.length; i++) {
			System.out.println();
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" ");
			}
		
     }

   }
}