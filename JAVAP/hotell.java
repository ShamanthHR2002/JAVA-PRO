class Hotell1{
    static int summerRoom = 4000;
    static int summerFood = 400;

  

    public static double book(String Package, boolean Food) {
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
		return 0;
		
}       
	}