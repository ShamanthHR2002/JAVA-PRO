class Banner 
{
     String text;
    int width;
     String backgroundColor;

    public Banner(String text, int width, String backgroundColor) 
	{
        this.text = text;
        this.width = width;
        this.backgroundColor = backgroundColor;
    }

    public void display() 
	{
        System.out.println("Banner Text: " + text);
        System.out.println("Width: " + width);
        System.out.println("Background Color: " + backgroundColor);
    }
}