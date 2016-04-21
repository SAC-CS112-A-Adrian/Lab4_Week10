import java.util.Scanner;

public class Lab {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double number1;
		double highNum;
		double lowNum;
		
		System.out.print("Please enter a low number: ");
		lowNum = input.nextDouble();

		System.out.print("Please enter a high number: ");
		highNum = input.nextDouble();

		RandomNumber myRandomNumber = new RandomNumber(highNum, lowNum);

		double randomNum = myRandomNumber.GetANumber();

		System.out.print("Please enter a number in-between: ");
		number1 = input.nextDouble();
		
		lowNum = myRandomNumber.GetLowNumber();
		highNum = myRandomNumber.GetHighNumber();
		
		System.out.printf("High: %f\nLow: %f\n", highNum, lowNum);

		if (number1 == randomNum)
			System.out.printf("Congrats, you guessed it. The correct number is %f\n", randomNum);
		else if (number1 > randomNum)
			System.out.printf("Your number is too large. The correct number is %f\n", randomNum);
		else
			System.out.printf("Your number is too small. The correct number is %f\n", randomNum);

	}

}