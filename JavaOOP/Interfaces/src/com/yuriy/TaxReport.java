package com.yuriy;

public class TaxReport {
    private TaxCalculator2018 taxCalculator2018;

    public TaxReport() {
        taxCalculator2018 = new TaxCalculator2018(100_000);
    }

    public void show() {
        var tax = taxCalculator2018.calculateTax();
        System.out.println(tax);
    }

}
