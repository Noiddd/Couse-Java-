package com.taxcalculator;

interface TaxCalculator {
    public double calculateTax();
}

class TaxCalculator2022 implements TaxCalculator {
    private double taxableIncome;

    public TaxCalculator2022(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        return taxableIncome * 0.3;
    }
}

class TaxReport {
    private TaxCalculator calculator;

    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }
}

public class LaunchTaxCalculator {
    public static void main(String[] args) {
        TaxCalculator2022 calculator = new TaxCalculator2022(100_000);
        TaxReport report = new TaxReport(calculator);

    }
}
