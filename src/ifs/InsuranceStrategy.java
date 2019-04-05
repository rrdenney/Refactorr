package ifs;

public abstract class InsuranceStrategy {
    abstract int getConstant();

    abstract double getWeight();

    abstract int getAdjustment();

    double getaDouble(double income, int i, double v, int i2) {
        return (income - i) * v + i2;
    }
}
