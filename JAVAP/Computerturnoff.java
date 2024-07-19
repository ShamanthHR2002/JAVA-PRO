class Computerturnoff
{
    public static void keyboard()
	{
        System.out.println("Press the F2 key");
        speaker();
    }

    public static void speaker() 
	{
        System.out.println("Play the music");
        monitor();
    }

    public static void monitor() 
	{
        System.out.println("Display the video");
        mouse();
    }
  public static void scanner() 
	{
        System.out.println("Capture the content of an image");
        printer();
    }

    public static void printer() 
	{
        System.out.println("Print text files or images from a computer and transfer them to a medium such as paper");
    }
}