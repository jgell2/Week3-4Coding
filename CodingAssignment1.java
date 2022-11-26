package week3Coding;

public class CodingAssignment1 {

	public static void main(String[] args) {
		//a
		int[] ages = {3,9,23,64,2,8,28,93};
		int firstElement = ages[0];
		int lastElement = ages.length-1;
		System.out.println(firstElement-ages[lastElement]);
		//b
		int[] ages2 = {3,9,23,64,2,8,28,93,41};
		int firstElement2 = ages2[0];
		int lastElement2 = ages2.length-1;
		System.out.println(firstElement2-ages2[lastElement2]);
		//c
		int sumTotal = 0;
		for(int i = 0; i<ages.length;i++) {
			sumTotal+=ages[i];
		}
		System.out.println(sumTotal/ages.length);
	}
}
