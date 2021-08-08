package assignmentWeek1;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int remainder, n = 674, calculated = 0;
		
		while (n>0) {
			
			remainder = n%10;
			calculated = calculated + remainder;
			n = n/10;
		}
		System.out.println("Sum of Digits: " + calculated);
	}

}
