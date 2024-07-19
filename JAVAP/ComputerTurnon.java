class ComputerTurnon 
{
    public static void keyboard()
	{
        System.out.println("Press the F2 key");
        speaker();36
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

    public static void mouse() 
	{
        System.out.println("Scroll down the cursor");
        webcamera();
        joystick();
        fingerprintscanner();
    }

    public static void webcamera() 
	{
        System.out.println("Capture the picture");
    }

    public static void joystick()
	{
        System.out.println("Control the movement or actions");
    }

    public static void fingerprintscanner() 
	{
        System.out.println("Recognizing and authenticating the fingerprint");
        scanner();
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