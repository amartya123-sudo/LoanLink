package com.project.loanlink;

import java.util.Scanner;

public class LoanCalculator extends Customer {
    double avgInc, netInc, maxAmount;
    public LoanCalculator(String id, String name, String email, double salary, double expenses, String address) {
        super(id, name, email, salary, expenses, address);
    }

    void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter previous 3 years ITR ");
        avgInc = (sc.nextFloat()+sc.nextFloat()+sc.nextFloat())/3;
        netInc = avgInc-getExpenses();
        maxAmount = netInc*6;

    }
    public void expenses()
    {
        if(getExpenses()<=0.4*getSalary())
            setExpenses(getSalary()*0.4);
    }

    public void maxLoan(String type)
    {
        if(type.equalsIgnoreCase("car"))
        {
            maxAmount = netInc*2;
        }
        else if(type.equalsIgnoreCase("home"))
        {
            maxAmount = netInc*6;
        }
        else
        {
            maxAmount = 0;
        }
    }
}

