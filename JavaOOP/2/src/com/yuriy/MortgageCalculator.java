package com.yuriy;

public class MortgageCalculator {
    final static byte MONTH_IN_YEAR = 12;
    final static byte PERCENT = 100;

    private double principal;
    private double annualRate;
    private int period;
    private double monthlyRate;

    public int getPeriodMonths() {
        return periodMonths;
    }

    private int periodMonths;

    public MortgageCalculator(
            double principal,
            double annualRate,
            int period
    ) {
        this.principal = principal;
        this.annualRate = annualRate;
        this.period = period;
        this.monthlyRate = this.calculateMonthlyRate(annualRate);
        this.periodMonths = this.calculatePeriodMonths(period);
    }

    public double calculateBalance(int numberOfPaymentsMade) {
        return principal
                * (Math.pow(1 + monthlyRate, periodMonths)
                - Math.pow(1 + monthlyRate, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyRate, periodMonths) - 1);
    }

    private double calculateMonthlyRate(double annualRate) {
        return annualRate / PERCENT / MONTH_IN_YEAR;
    }

    private int calculatePeriodMonths(int period) {
        return period * MONTH_IN_YEAR;
    }

    public double calculateMortgage() {
        return principal *
                monthlyRate * Math.pow(1 + monthlyRate, periodMonths) /
                (Math.pow(1 + monthlyRate, periodMonths) - 1);
    }
}
