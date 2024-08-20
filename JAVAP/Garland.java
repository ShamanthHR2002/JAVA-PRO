class Garland 
{
     String color;
     int length;
     String material;

    public Garland(String color, int length, String material) 
	{
        this.color = color;
        this.length = length;
        this.material = material;
    }

    public void display()
	{
        System.out.println("Garland Color: " + color);
        System.out.println("Length: " + length);
        System.out.println("Material: " + material);
    }
}