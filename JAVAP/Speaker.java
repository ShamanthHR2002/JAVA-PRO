class Speaker 
{
    private String brand;
    private String size;
    private double cost;
    private int output;

    // Default constructor
    public Speaker() 
	{
        
    }

    // Parameterized constructor
    public Speaker(String brand, String size, double cost, int output) 
	{
        this.brand = brand;
        this.size = size;
        this.cost = cost;
        this.output = output;
    }

    // Setter methods
    public void setBrand(String brand) 
	{
        this.brand = brand;
    }

    public void setSize(String size) 
	{
        this.size = size;
    }

    public void setCost(double cost) 
	{
        this.cost = cost;
    }

    public void setOutput(int output) 
	{
        this.output = output;
    }

    // Method to print all instance variables
    public void printDetails() 
	{
        System.out.println("Brand: " + brand + ", Size: " + size + ", Cost: " + cost + ", Output: " + output);
    }
}