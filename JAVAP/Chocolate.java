class Chocolate
 {
    private String brand;
    private double price;
    private String flavour;
    private String size;

    
    public Chocolate() 
	{
        
    }

    
    public Chocolate(String brand, double price, String flavour, String size)
	{
        this.brand = brand;
        this.price = price;
        this.flavour = flavour;
        this.size = size;
    }

    
    public void setBrand(String brand) 
	{
        this.brand = brand;
    }

    public void setPrice(double price)
	{
        this.price = price;
    }

    public void setFlavour(String flavour)
	{
        this.flavour = flavour;
    }

    public void setSize(String size)
	{
        this.size = size;
    }

    
    public void printDetails()
	{
        System.out.println("Brand: " + brand + ", Price: " + price + ", Flavour: " + flavour + ", Size: " + size);
    }
}