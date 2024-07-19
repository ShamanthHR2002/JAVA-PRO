class MedicineRunner 
{
    public static void main(String[] args) 
	{
        if (args.length == 4) 
		{
            String name = args[0];
            String mnfdate = args[1];
            String price = args[2];
            String quantity = args[3];
            double convertedprice= Double.parseDouble(price);
            int convertedquantity= Integer.parseInt(quantity);
            Medicine.info(name, mnfdate, convertedprice, convertedquantity);
        }
		else {
            System.out.println("4 Args required");
        }
    }
}