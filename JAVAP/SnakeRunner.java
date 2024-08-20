class SnakeRunner 
{
    public static void main(String[] args)
	{
		Snake snake = new Snake("King Cobra", 10, "Black");
		
        Snake snake1 = new Snake("Naga", 9, "Black");
		
        Snake snake2 = new Snake("Kere", 8, "Black");

        Snake[] snakes = new Snake[3];
		
		
        snakes[0] = snake;
        snakes[1] = snake1;
        snakes[2] = snake2;

        
        for (Snake snakeee : snakes) 
		{
            snakeee.print();
        }
    }
}
