class Bucket {
    String material;
    String color;
    int capacity;
    float height;
    boolean hasHandle;
    String brand;

    public Bucket() {
        System.out.println("Bucket:");
    }

    public Bucket(String material) {
        this.material = material;
    }

    public Bucket(String material, String color) {
        this(material);
        this.color = color;
    }

    public Bucket(String material, String color, int capacity) {
        this(material, color);
        this.capacity = capacity;
    }

    public Bucket(String material, String color, int capacity, float height) {
        this(material, color, capacity);
        this.height = height;
    }

    public Bucket(String material, String color, int capacity, float height, boolean hasHandle) {
        this(material, color, capacity, height);
        this.hasHandle = hasHandle;
    }

    public Bucket(String material, String color, int capacity, float height, boolean hasHandle, String brand) {
        this(material, color, capacity, height, hasHandle);
        this.brand = brand;
    }

    void display() {
        System.out.println("Material: " + material + "\nColor: " + color + "\nCapacity: " + capacity + " L" +
                "\nHeight: " + height + " cm\nHas Handle: " + hasHandle + "\nBrand: " + brand);
        System.out.println("============================");
    }
}
