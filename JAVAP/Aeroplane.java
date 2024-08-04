class Aeroplane 
{
    String company;
    int noOfSeats;
    double ticketPrice;
    String source;
    String destination;

    
    Aeroplane()
	{
        System.out.println("Aeroplane created with default values.");
    }

   
    Aeroplane(String company, int noOfSeats, double ticketPrice, String source, String destination)
	{
        this.company = company;
        this.noOfSeats = noOfSeats;
        this.ticketPrice = ticketPrice;
        this.source = source;
        this.destination = destination;
        System.out.println("Aeroplane created with company: " + this.company + ", noOfSeats: " + this.noOfSeats + ", ticketPrice: " + this.ticketPrice + ", source: " + this.source + ", destination: " + this.destination);
    }

   
    Aeroplane(String company, String source, String destination) 
	{
        this.company = company;
        this.source = source;
        this.destination = destination;
        System.out.println("Aeroplane created with company: " + this.company + ", source: " + this.source + ", destination: " + this.destination);
    }

    
    Aeroplane(String company, double ticketPrice, String source, String destination)
	{
        this.company = company;
        this.ticketPrice = ticketPrice;
        this.source = source;
        this.destination = destination;
        System.out.println("Aeroplane created with company: " + this.company + ", ticketPrice: " + this.ticketPrice + ", source: " + this.source + ", destination: " + this.destination);
    }
}
