package com.xworkz.interface18224;

public class BCCIRunner {
    public static void main(String[] args) {
        CricketRule cricketRule = new KaCricketRule();
        BCCI bcci = new BCCI();
        bcci.setCricketRule(cricketRule);
        bcci.check();
    }
}

