package com.shamanth.inheritance280824;

public class Shwetha {
	void carryBottle(WaterBottle bottle) {
        if (bottle != null) {
            bottle.fill();
            bottle.empty();
            bottle.crush();
        } else {
            System.out.println("Bottle is null.");
        }
    }
}
