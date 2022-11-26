package week3Coding;

public class CodingAssignment7through12 {

	public static void main(String[] args) {
		
		//7
		String word = "Hello";
		int n = 3;
		firstMethod(word,n);
		
		System.out.println("");
		
		//8
		String firstName = "Jack";
		String lastName ="Gell";
		secondMethod(firstName, lastName);
		
		//9
		int[] num = {56, 89, 105, 305, 667, 5, 88, 410};
		int[] num2 = {3, 4, 1, 2, 6};
		System.out.println(thirdMethod(num));
		
		//10
		double[] dec = {12.5, 4.2, 6.7, 9.0, 2.1, 13.6, 47.5};
		fourthMethod(dec);
		
		//11
		double[] numbers1= {7.9, 9.0, 154.2, 55.2};
		double[] numbers2= {8.9, 0.2, 54.2, 45.1};
		System.out.println(fifthMethod(numbers1, numbers2));
		
		//12
		boolean hot = true;
		double money = 15.80;
		System.out.println(willBuyDrink(hot, money));
		
	}
	
	//7 method
	
	public static void firstMethod(String word, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(word);
		}
	}
	
	//8 method
	public static void secondMethod(String firstName, String lastName) {
		System.out.println(firstName + " " + lastName);
	}
	
	//9 method
	public static boolean thirdMethod(int[] nums) {
		int sumTotal = 0;
		for (int i=0; i<nums.length;i++) {
			sumTotal+=nums[i];		
		}
		if (sumTotal>100) {
			return true;
		}else {
			return false;
		}
	}
	
	//10 method
	public static void fourthMethod(double[] nums) {
		double sumTotal = 0.0;
		for (int i=0; i<nums.length;i++) {
			sumTotal+=nums[i];
		}
		System.out.println(sumTotal/nums.length);
	}
	
	//11 method
	public static boolean fifthMethod(double[] nums1, double[] nums2) {
		double sumTotal1= 0.0;
		for (int i=0; i<nums1.length;i++) {
			sumTotal1+=nums1[i];
		}
		double average1=sumTotal1/nums1.length;
		double sumTotal2 =0.0;
		for (int j=0; j<nums2.length;j++) {
			sumTotal2+=nums2[j];
		}
		double average2 = sumTotal2/nums2.length;
		if(average1>average2) {
			return true;
		}else {
			return false;
		}
	}
	
	//12 method
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside == true && moneyInPocket>10.50) {
			return true;
		}else {
			return false;
		}
	}
	
}
