package ifs;

public class Refactoring {

    private final InsuranceStrategyVeryHigh insuranceStrategyVeryHigh = new InsuranceStrategyVeryHigh();

    public double calculateInsurance(double income) {
        if (income <= 10000) {
            return income*0.365;
        } else if (income <= 30000) {
            return insuranceStrategyVeryHigh.getaDouble(income, 10000, 0.2, 35600);
        } else if (income <= insuranceStrategyVeryHigh.getAdjustment()) {
            return insuranceStrategyVeryHigh.getaDouble(income, 30000, 0.1, 76500);
        } else {
            return insuranceStrategyVeryHigh.getaDouble(income, insuranceStrategyVeryHigh.getAdjustment(), insuranceStrategyVeryHigh.getWeight(), insuranceStrategyVeryHigh.getConstant());
        }

    }
}