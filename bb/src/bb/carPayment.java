package bb;

import java.text.DecimalFormat;

public class carPayment {
	private double carCost;
	private double interestRate;
	private int month;
	private double downPayment;

	public carPayment(double num1, double num2, int num3, double num4) {
		this.carCost = num1;
		this.interestRate = num2;
		this.month = num3;
		this.downPayment = num4;
	}

	public double monthlyPay() {
		double a = (interestRate / 12) * (carCost-downPayment);
		double b = Math.pow(1 + interestRate / 12, -1 * month);
		return a / (1 - b);

	}

	public double interestPay() {
		return month * monthlyPay() - carCost;
	}


}
