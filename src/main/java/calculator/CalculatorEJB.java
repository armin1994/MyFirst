package calculator;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Session Bean implementation class CalculatorEJB
 */
@Path("calc")
@Stateless
public class CalculatorEJB implements CalculatorEJBRemote {

    /**
     * Default constructor. 
     */
    public CalculatorEJB() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		return a-b;
	}
	@GET
	@Override
	public String test() {
		return "1337";
	}

}
