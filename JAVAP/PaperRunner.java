class PaperRunner 
{
    public static void main(String[] args) 
	{
        Paper paper1 = new Paper();
        Paper paper2 = new Paper("0.1mm", "A4", "High", "White");
        Paper paper3 = new Paper();
        paper3.setThickness("0.2mm");
        paper3.setSize("A3");
        paper3.setQuality("Medium");
        paper3.setColor("Blue");

        System.out.println("Paper 1 Details:");
        paper1.printDetails();
        System.out.println("Paper 2 Details:");
        paper2.printDetails();
        System.out.println("Paper 3 Details:");
        paper3.printDetails();
    }
}
