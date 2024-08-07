class HotelBook{
    static int summerRoom = 4000;
    static int summerFood = 400;
	
	 static int rainRoom = 5000;
     static int rainFood = 500;

     static int winterRoom = 6000;
     static int winterFood = 600;

  

    public static double book(String Package, boolean Food)
	{
        double totalPrice = 0;

        if (Package=="Summer") 
		{
            if (Food) 
			{
                totalPrice = summerRoom + summerFood;
				return totalPrice;
			}
			else
			{
				totalPrice = summerRoom;
				return totalPrice;
				
			}
            			
     

		}
		else if (Package=="Rain") 
		{
            if (Food) 
			{
                totalPrice = rainRoom + rainFood;
				return totalPrice;
			}
			else
			{
				totalPrice = rainRoom;
				return totalPrice;
				
			}
            			
     

		}
		else if (Package=="winter") 
		{
            if (Food) 
			{
                totalPrice = winterRoom + winterFood;
				return totalPrice;
			}
			else
			{
				totalPrice = winterRoom;
				return totalPrice;
				
			}
            			
     

		}
		return 0;
		
}       
	}