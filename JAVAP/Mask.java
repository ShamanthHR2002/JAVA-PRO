class Mask {
    double cost;
    char size;
    String material;

   
    Mask() {
        System.out.println("Mask created with default values.");
    }

   
    Mask(double cost) {
        this.cost = cost;
        System.out.println("Mask created with cost: " + this.cost);
    }

   
    Mask(char size) {
        this.size = size;
        System.out.println("Mask created with size: " + this.size);
    }

   
    Mask(String material) {
        this.material = material;
        System.out.println("Mask created with material: " + this.material);
    }

    
    Mask(double cost, char size, String material) {
        this.cost = cost;
        this.size = size;
        this.material = material;
        System.out.println("Mask created with cost: " + this.cost + ", size: " + this.size + ", material: " + this.material);
    }

    
    Mask(double cost, char size) {
        this.cost = cost;
        this.size = size;
        System.out.println("Mask created with cost: " + this.cost + ", size: " + this.size);
    }
}
