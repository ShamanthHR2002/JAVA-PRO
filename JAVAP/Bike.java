class Bike {
    public static void mirror() {
        System.out.println("see the back");
        horn();
    }

    public static void horn() {
        System.out.println("make noise");
        mirror();
    }

    public static void main(String[] args) {
        mirror();
    }
}