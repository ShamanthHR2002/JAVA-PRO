package com.xworkz.interface18224;

public class BCCI {
    private CricketRule cricketRule;

    public void setCricketRule(CricketRule cricketRule) {
        this.cricketRule = cricketRule;
    }

    public void check() {
        System.out.println("Running CricketRule in BCCI");
        if (cricketRule != null) {
            System.out.println("CricketRule not Null");
        } else {
            System.out.println("CricketRule is Null");
        }
    }
}
