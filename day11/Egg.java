class Egg {
    String type;
    String color;
    float weight;
    boolean isOrganic;
    String origin;
    int shelfLife;

    public Egg() {
        System.out.println("Egg:");
    }

    public Egg(String type) {
        this.type = type;
    }

    public Egg(String type, String color) {
        this(type);
        this.color = color;
    }

    public Egg(String type, String color, float weight) {
        this(type, color);
        this.weight = weight;
    }

    public Egg(String type, String color, float weight, boolean isOrganic) {
        this(type, color, weight);
        this.isOrganic = isOrganic;
    }

    public Egg(String type, String color, float weight, boolean isOrganic, String origin) {
        this(type, color, weight, isOrganic);
        this.origin = origin;
    }

    public Egg(String type, String color, float weight, boolean isOrganic, String origin, int shelfLife) {
        this(type, color, weight, isOrganic, origin);
        this.shelfLife = shelfLife;
    }

    void display() {
        System.out.println("Type: " + type + "\nColor: " + color + "\nWeight: " + weight + " g\nOrganic: " + isOrganic +
                "\nOrigin: " + origin + "\nShelf Life: " + shelfLife + " days");
        System.out.println("============================");
    }
}
