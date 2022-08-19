
public class Java2DArray {
	public static void main(String[] args) {
		
		// 2D array = an array of arrays(Multi-dimentional Array)
		
				String[][] cars = 	{	
										{"Camaro","Corvette","Silverado"},
										{"Mustang","Ranger","F-150"},
										{"Ferrari","Lambo","Tesla"}
									};
				
				/*								 	   	               			0			    1		          2
				cars[0][0] = "Camaro";			  0	 Camaro	| Corvette  | Silverado
				cars[0][1] = "Corvette";	   				 ---------+----------+-----------
				cars[0][2] = "Silverado";			  1    Mustang	|   Ranger  |   F-150
				cars[1][0] = "Mustang";		   			 ---------+----------+-----------
				cars[1][1] = "Ranger";			  2	 Farrari	    |   Lambo   |   Tesla
				cars[1][2] = "F-150";
				cars[2][0] = "Ferrari";
				cars[2][1] = "Lambo";
				cars[2][2] = "Tesla";
				*/
		
		for(int i=0; i<cars.length; i++) {
			System.out.println();
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" ");
			}
		}
	}
}
