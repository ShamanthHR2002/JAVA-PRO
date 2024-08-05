 class SpeakerRunner
{
    public static void main(String[] args) 
	{
        
        Speaker speaker1 = new Speaker();
        Speaker speaker2 = new Speaker("Sony", "Medium", 200.00, 160);
        Speaker speaker3 = new Speaker();
        speaker3.setBrand("JBL");
        speaker3.setSize("Large");
        speaker3.setCost(499.99);
        speaker3.setOutput(200);

        
        System.out.println("Speaker 1 Details:");
        speaker1.printDetails();
        System.out.println("Speaker 2 Details:");
        speaker2.printDetails();
        System.out.println("Speaker 3 Details:");
        speaker3.printDetails();
	}
}