package bb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.text.DecimalFormat;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		double carCost=35000;
		int month=60;
		double interestRate=0.1;
		double downPayment=0;
		carPayment c= new carPayment(carCost,interestRate,month,downPayment);
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		
		assertEquals(numberFormat.format(c.monthlyPay()),"743.65");
		System.out.println(numberFormat.format(c.monthlyPay()));
		
		assertEquals(numberFormat.format(c.interestPay()),"9618.79");
		System.out.println(numberFormat.format(c.interestPay()));
	}

}
