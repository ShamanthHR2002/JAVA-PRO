class Kerosene 
{
    double price;
    int quantity;
    boolean quality;

    
    Kerosene()
	{
        System.out.println("Kerosene created with default values.");
    }

   
    Kerosene(double price, int quantity, boolean quality) 
	{
        this.price = price;
        this.quantity = quantity;
        this.quality = quality;
        System.out.println("Kerosene created with price: " + this.price + ", quantity: " + this.quantity + ", quality: " + this.quality);
    }

    
    Kerosene(boolean quality) 
	{
        this.quality = quality;
        System.out.println("Kerosene created with quality: " + this.quality);
    }

    
    Kerosene(double price)
	{
        this.price = price;
        System.out.println("Kerosene created with price: " + this.price);
    }
}
