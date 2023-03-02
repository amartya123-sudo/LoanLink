package com.project.loanlink;

public class Main
{
    public static void main(String[] args) {
        LoanCalculator c1;
        String LoanType = "Car";
        c1 = new LoanCalculator("33","hary puttar","someone@gmail.com",335333.33,34,"No one knows me");
        c1.getSalary();
        c1.expenses();
        c1.maxLoan("Car");
    }
}
