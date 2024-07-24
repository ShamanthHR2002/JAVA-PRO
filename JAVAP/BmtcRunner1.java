class BmtcRunner1 {
    public static void main(String[] args) {
        System.out.println("start main in BmtcRunner");

        
        Bmtc bmtc = new Bmtc();
        
        
        int ref = bmtc.charge;
        System.out.println("bmtc charge: " + ref);
        String ref2 = bmtc.busStation;
        System.out.println("bmtc busStation: " + ref2);
        int ref3 = bmtc.depots;
        System.out.println("bmtc depots: " + ref3);
        
        
        bmtc.charge = 25;
        bmtc.busStation = "kr puram";
        bmtc.depots = 5;
        
        
        System.out.println("update bmtc charge: " + bmtc.charge);
        System.out.println("update bmtc busStation: " + bmtc.busStation);
        System.out.println("update bmtc depots: " + bmtc.depots);
        
        System.out.println("end main in BmtcRunner");
    }
}


 