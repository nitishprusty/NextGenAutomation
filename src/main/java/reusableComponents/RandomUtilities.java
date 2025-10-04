package reusableComponents;

import java.util.concurrent.ThreadLocalRandom;

public class RandomUtilities  
{
	/**
	 *
	 * Generate Random Integer number within range
	 *
	 * @since 14/02/2020
	 * @author Nikhil Singh
	 *
	 */
	public static int generateRandomNumber(int minNumber, int maxNumber) 
	{
		int randomNum;
		return randomNum = ThreadLocalRandom.current().nextInt(minNumber, maxNumber + 1);
	}
	
	public static double generateRandomNumber(double minNumber, double maxNumber) 
	{
		double randomNum;
		return randomNum = ThreadLocalRandom.current().nextDouble(minNumber, maxNumber + 1);
	}

}
