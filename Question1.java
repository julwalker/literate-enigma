public class SimplyBuy {
	
	public static double calculateTotalPayment(double levelofDebtIn, double interestIn, double repaymentIn) {
		double initialLevelofDebt = levelofDebtIn;
		double percentageInterest = interestIn;
		double percentageRepayment = repaymentIn;
		double totalInterest = 0;
		double deposit = initialLevelofDebt * 0.1;
		double currentLevelofDebt = (initialLevelofDebt - deposit);
		
		do {
			double interest = (currentLevelofDebt * (percentageInterest/100));
			totalInterest = totalInterest + interest;
			System.out.println("the interest so far is: " + totalInterest);
			currentLevelofDebt = currentLevelofDebt + interest;
			double repayment = currentLevelofDebt * (percentageRepayment/100);
			if(repayment < 50) {
			   repayment = 50;
			}
			currentLevelofDebt = currentLevelofDebt - repayment;
			System.out.println("the current level of debt is: " + currentLevelofDebt);
		} while(currentLevelofDebt > 0);
		double totalCostofMortgage = initialLevelofDebt + totalInterest;
		return totalCostofMortgage;
	}

    public static void main(String[] arg) {
    System.out.println(calculateTotalPayment(1000, 5, 10));   
    }
}
