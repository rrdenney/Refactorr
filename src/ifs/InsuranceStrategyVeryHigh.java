package ifs;

public class InsuranceStrategyVeryHigh {
    public InsuranceStrategyVeryHigh() {
    }

    int getConstant() {
        return 105600;
    }

    double getWeight() {
        return 0.02;
    }

    int getAdjustment() {
        return 60000;
    }

    double getaDouble(double income, int i, double v, int i2) {
        return (income - i) * v + i2;
    }
}