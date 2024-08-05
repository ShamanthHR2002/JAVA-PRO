class ChocolateRunner
{
    public static void main(String[] args) 
	{
	
        Chocolate chocolate1 = new Chocolate();
        Chocolate chocolate2 = new Chocolate("Cadbury", 99.99, "Milk", "Medium");
        Chocolate chocolate3 = new Chocolate();
        chocolate3.setBrand("Lindt");
        chocolate3.setPrice(129.99);
        chocolate3.setFlavour("Dark");
        chocolate3.setSize("Small");

        
        System.out.println("Chocolate  1 Details:");
        chocolate1.printDetails();
        System.out.println("Chocolate  2 Details:");
        chocolate2.printDetails();
        System.out.println("Chocolate  3 Details:");
        chocolate3.printDetails();
	}
}	