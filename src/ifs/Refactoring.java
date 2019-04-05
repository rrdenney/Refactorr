package ifs;

public class Refactoring {

    private InsuranceStrategyVeryHigh strategy;

    {
    }

    public double calculateInsurance(double income) {
        if (income <= 10000) {
            return income*0.365;
        } else if (income <= 30000) {
            return strategy.getaDouble(income, 10000, 0.2, 35600);
        } else if (income <= strategy.getAdjustment()) {
            return strategy.getaDouble(income, 30000, 0.1, 76500);
        } else {
            strategy = new InsuranceStrategyVeryHigh();
            return strategy.getaDouble(income, strategy.getAdjustment(), strategy.getWeight(), strategy.getConstant());
        }

    }
}