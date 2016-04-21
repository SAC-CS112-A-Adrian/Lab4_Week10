
public class RandomNumber {

	private double highNum;
	private double lowNum;

	public RandomNumber(double high, double low) {
		highNum = high;
		lowNum = low;
	}

	public double GetANumber() {

		double computerNum = 1 + (int) (Math.random() * highNum);
		return computerNum;
	}
	
	public double GetLowNumber() {

		return lowNum;
	}
	
	public double GetHighNumber() {

		return highNum;
	}

}
