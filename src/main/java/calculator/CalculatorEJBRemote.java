package calculator;

import javax.ejb.Remote;

@Remote
public interface CalculatorEJBRemote {
	/**  
	 * this method return the sum of two int
	 * @param a
	 * @param b
	 * @return int
	 */
	public int add(int a,int b);
	/**  
	 * this method return the difference between two int
	 * @param a
	 * @param b
	 * @return int
	 */
	public int substract(int a,int b);
	public String test();
}
