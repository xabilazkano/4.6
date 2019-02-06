/**
* 
*/
package com.zubiri.ariketak;

/**
 * @author ir013043zb
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Counter a = new Counter();
		Counter b = new Counter();
		Counter c = new Counter();
		Counter d = new Counter();

		//As the variable is public we can acces directly
		System.out.println("public static int countA: " + Counter.countA);
		//We use the method in a non static way
		System.out.println("public int getCounterA: " + a.getCounterA());
		//We use the method in a static way
		System.out.println("public int getCounterA: " + Counter.getCounterA());
		
		//As the variable is public we can acces directly
		System.out.println("private static int countB: " + Counter.countB);
		//We use the method in a non static way
		System.out.println("public int getCounterB: " + b.getCounterB());
		//We use the method in a static way
		System.out.println("public int getCounterB: " + Counter.getCounterB());

		//We use the method in a static way
		System.out.println("Bikoitia al da A? " + Counter.isEvenA());
		//We use the method in a static way
		System.out.println("Bikoitia al da (_num=3)? " + Counter.isEven(3));
		//We use the method in a static way
		System.out.println("Bikoitia al da (_num=4)? " + Counter.isEven(4));
	}
}
