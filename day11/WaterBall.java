class WaterBall {
    String color;
    float diameter;
    String material;
    boolean isReusable;
    int waterCapacity;
    String brand;

    public WaterBall() {
        System.out.println("WaterBall:");
    }

    public WaterBall(String color) {
        this.color = color;
    }

    public WaterBall(String color, float diameter) {
        this(color);
        this.diameter = diameter;
    }

    public WaterBall(String color, float diameter, String material) {
        this(color, diameter);
        this.material = material;
    }

    public WaterBall(String color, float diameter, String material, boolean isReusable) {
        this(color, diameter, material);
        this.isReusable = isReusable;
    }

    public WaterBall(String color, float diameter, String material, boolean isReusable, int waterCapacity) {
        this(color, diameter, material, isReusable);
        this.waterCapacity = waterCapacity;
    }

    public WaterBall(String color, float diameter, String material, boolean isReusable, int waterCapacity, String brand) {
        this(color, diameter, material, isReusable, waterCapacity);
        this.brand = brand;
    }

    void display() {
        System.out.println("Color: " + color + "\nDiameter: " + diameter + " cm\nMaterial: " + material +
                "\nReusable: " + isReusable + "\nWater Capacity: " + waterCapacity + " ml\nBrand: " + brand);
        System.out.println("============================");
    }
}
