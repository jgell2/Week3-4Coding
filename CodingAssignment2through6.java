package week3Coding;

public class CodingAssignment2through6 {

	public static void main(String[] args) {
		String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		int sumTotal = 0;
		for(int i=0;i<names.length;i++) {
			sumTotal+=names[i].length();
			}
		System.out.println(sumTotal/names.length);
		for(int j=0; j<names.length; j++) {
			System.out.print(names[j]+ " ");
		}
		System.out.println("");
		
		//3. you can access the first element in an array by setting the index to 0, i.e. names[0] in the above example
		//4. you can access the last element in an array by using the ".length" method and subtracting 1 as the last index will always be one number lower than the length
		
		//5
		int[] nameLengths= new int[6];
		for(int c=0;c<nameLengths.length;c++) {
			nameLengths[c]=names[c].length();
		}
		//6
		int sumTotal2 = 0;
		for(int d=0;d<nameLengths.length;d++) {
			sumTotal2+=nameLengths[d];			
		}
		System.out.println(sumTotal2);
	}

}
