class VideoGame
 {
     String name;
     int releaseYear;
     String genre;

    public VideoGame(String name, int releaseYear, String genre) 
	{
        this.name = name;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }

    public void display() 
	{
        System.out.println("VideoGame Name: " + name);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Genre: " + genre);
    }
}