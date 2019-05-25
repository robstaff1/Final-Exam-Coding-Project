package app.controller;

public class Loan {
	
	public double findTotalPayments(double loanAmount, int loanTerm, double interestRate) {
		interestRate= interestRate/1200;
		int months = loanTerm*12;
		double numerator = interestRate*loanAmount*months;
		double denominator = 1-(Math.pow(1+interestRate, -1*months));
		double totalPayment = numerator/denominator;
		double total = Math.round(totalPayment*100)/100;
		
		return total;
	}
}
