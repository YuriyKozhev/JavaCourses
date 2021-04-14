package com.yuriy;

public class Main {

    public static void main(String[] args) {
        var taxCalculator2018 = new TaxCalculator2018(100_000);
        var taxReport = new TaxReport();
        taxReport.show(taxCalculator2018);

//        taxReport.setTaxCalculator(new TaxCalculator2019());
//        taxReport.show();
    }
}
