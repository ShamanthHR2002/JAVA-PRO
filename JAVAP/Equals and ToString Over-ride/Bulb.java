package com.shamanthhr.equaltostringoverride;
import java.util.Objects;
public class Bulb {
	  private String brand;
	    private String type;
	    private double wattage;
	    private String color;
	    private double price;
	    private boolean isLED;

	    
	    public Bulb(String brand, String type, double wattage, String color, double price, boolean isLED) {
	        this.brand = brand;
	        this.type = type;
	        this.wattage = wattage;
	        this.color = color;
	        this.price = price;
	        this.isLED = isLED;
	    }

	    
	    @Override
	    public String toString() {
	        return "Bulb [brand=" + brand + ", type=" + type + ", wattage=" + wattage +
	               ", color=" + color + ", price=" + price + ", isLED=" + isLED + "]";
	    }

	   
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;

	        Bulb bulb = (Bulb) obj;
	        return Objects.equals(brand, bulb.brand) &&
	               Objects.equals(type, bulb.type) &&
	               Double.compare(bulb.wattage, wattage) == 0;
	    }
}
