public class PaintRunner {
    public static void main(String[] args) {
       
        Paint.brand("Asian");
        Paint.brandAndColor("Asian", "Red");
        Paint.brandAndPrice("Asian", 80);
        Paint.brandTypeAndPrice("Asian", "Oil", 80);
       
      
        Train.book("Horanadu", "Bangalore");
        Train.book("Horanadu", "Bangalore", 25);
        Train.book("Horanadu", "Bangalore", 25, 500.0);
        Train.cancel(12345);
        Train.cancel("Horanadu", "Bangalore");

       
        Bus.sixwheels("BMTC");
        Bus.sixwheels(180, 3.5);
        Bus.sixwheels("R15", 2021, false);
        Bus.sixwheels('A', 40.5f);
        Bus.sixwheels("V-twin", "Red", 150.0);
    }
}