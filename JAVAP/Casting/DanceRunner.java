package com.shamanthhr.casting;

public class DanceRunner {
    public static void main(String[] args) {
        
        Belt belt = new Belt();
        belt.tie();
        
        Belt leatherBelt = new LeatherBelt(); 
        
        Dancer dancer = new Dancer();
        dancer.use(leatherBelt); 
    }
}
