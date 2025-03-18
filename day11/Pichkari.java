class Pichkari {
    String type;
    String color;
    int capacity;
    float length;
    String material;
    boolean isAutomatic;

    public Pichkari() {
        System.out.println("Pichkari:");
    }

    public Pichkari(String type) {
        this.type = type;
    }

    public Pichkari(String type, String color) {
        this(type);
        this.color = color;
    }

    public Pichkari(String type, String color, int capacity) {
        this(type, color);
        this.capacity = capacity;
    }

    public Pichkari(String type, String color, int capacity, float length) {
        this(type, color, capacity);
        this.length = length;
    }

    public Pichkari(String type, String color, int capacity, float length, String material) {
        this(type, color, capacity, length);
        this.material = material;
    }

    public Pichkari(String type, String color, int capacity, float length, String material, boolean isAutomatic) {
        this(type, color, capacity, length, material);
        this.isAutomatic = isAutomatic;
    }

    void display() {
        System.out.println("Type: " + type + "\nColor: " + color + "\nCapacity: " + capacity + " ml" +
                "\nLength: " + length + " cm\nMaterial: " + material + "\nAutomatic: " + isAutomatic);
        System.out.println("============================");
    }
}
