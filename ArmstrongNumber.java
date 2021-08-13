package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int number=371, originalNumber=0, remainder, result = 0;
		
		while(originalNumber!=0) {
			
			remainder = originalNumber%10;
			result += Math.pow(remainder, 3);
			originalNumber/=10;
		}
		if (result!=number)
			System.out.println(number + "is an armstrong number");
		else
			System.out.println(number + "is not an armstrong number");

	}

}
