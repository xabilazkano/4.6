/**
* 
*/
package com.zubiri.ariketak;

/**
 * @author ir013043zb
 *
 */
public class Counter {

	//We create two staticc variables
	public static int countA = 0;
	public static int countB = 0;

	/**
	 * When an instance is created these variables will sum 1
	 */
	Counter() {
		countA++;
		countB++;
	}

	/**
	 * Returns the value of countA
	 * @return
	 */
	public static int getCounterA() {
		return countA;
	}

	/**
	 * Returns the value of CountB
	 * @return
	 */
	public static int getCounterB() {
		return countB;
	}

	/**
	 * Checks if countA is even
	 * @return true if even, false if odd
	 */
	public static boolean isEvenA() {
		if (countA % 2 == 0) {
			return true;
		}
		return false;
	}

	/**
	 * Checks if a given number is even
	 * @param _num
	 * @return true if even, false if odd
	 */
	public static boolean isEven(int _num) {
		if (_num % 2 == 0) {
			return true;
		}
		return false;
	}
}