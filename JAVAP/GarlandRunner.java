class GarlandRunner
{
    public static void main(String[] args) 
	{
        
        VideoGame game1 = new VideoGame("The Last of Us", 2013, "Action-Adventure");
        VideoGame game2 = new VideoGame("Cyberpunk 2077", 2020, "RPG");
        VideoGame game3 = new VideoGame("Super Mario Odyssey", 2017, "Platformer");

        VideoGame[] videoGames = { game1, game2, game3 };

        for (int i = 0; i < videoGames.length; i++)
		{
            System.out.println("Reading VideoGame from index: " + i);
            videoGames[i].display();
        }
		/////////////////////////////////////////////

       
        Garland garland1 = new Garland("Red", 10, "Paper");
        Garland garland2 = new Garland("Green", 15, "Plastic");
        Garland garland3 = new Garland("Blue", 12, "Cloth");

        Garland[] garlands = { garland1, garland2, garland3 };

        for (int i = 0; i < garlands.length; i++) 
		{
            System.out.println("Reading Garland from index: " + i);
            garlands[i].display();
        }

       ///////////////////////////////////////////////
        GiantWheel wheel1 = new GiantWheel("London Eye", 135, "London");
        GiantWheel wheel2 = new GiantWheel("Singapore Flyer", 165, "Singapore");
        GiantWheel wheel3 = new GiantWheel("High Roller", 168, "Las Vegas");

        GiantWheel[] giantWheels = { wheel1, wheel2, wheel3 };

        for (int i = 0; i < giantWheels.length; i++) 
		{
            System.out.println("Reading GiantWheel from index: " + i);
            giantWheels[i].display();
        }
         /////////////////////////////////////////
        
        Banner banner1 = new Banner("Welcome", 10, "Yellow");
        Banner banner2 = new Banner("Sale", 8, "Red");
        Banner banner3 = new Banner("Happy Birthday", 12, "Blue");

        Banner[] banners = { banner1, banner2, banner3 };

        for (int i = 0; i < banners.length; i++)
		{
            System.out.println("Reading Banner from index: " + i);
            banners[i].display();
        }
    }
}