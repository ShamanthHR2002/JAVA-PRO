class BuyRunner
{
  public static void main(String[] args)
  {
	   Buy.product("Lee",500);Buy.product("Lee",-200);
	   Buy.product("Mobile",5,"Good",20000); Buy.product("Mobile",-4,"Good",1000);
	   Buy.bookMovieTicket("kalki","PVR",2,300);Buy.bookMovieTicket("kalki","PVR",-1,300);
	   Buy.buyEgg(10,60);Buy.buyEgg(5,60);
	   Buy.buyShampoo(200,60.00,"Dove","16 Dec 2023");Buy.buyShampoo(400,-60.00,"Dove","16 Feb 2025");
	   Buy.buyCake('M',"drycake","strawberry",450,2); Buy.buyCake('M',"drycake","strawberry",-50,2);
	   Buy.buyLaptop("samsung",58796,59000,90,55,"windows",500,250); Buy.buyLaptop("Fastrack",-58796,59000,90,55,"windows",500,250);
	   Buy.buySmartWatch("Fastrack",6000,int red,'L',int mode); Buy.buySmartWatch("samsung",6000,int red,'L',int mode);
	   
	  
  }
}