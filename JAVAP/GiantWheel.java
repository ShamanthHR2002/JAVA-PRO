class GiantWheel 
{
     String name;
     int height;
     String location;

    public GiantWheel(String name, int height, String location) 
	{
        this.name = name;
        this.height = height;
        this.location = location;
    }

    public void display() 
	{
        System.out.println("GiantWheel Name: " + name);
        System.out.println("Height: " + height);
        System.out.println("Location: " + location);
    }
}