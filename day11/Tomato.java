class Tomato {
    String variety;
    String color;
    float weight;
    boolean isOrganic;
    String origin;
    int shelfLife;

    public Tomato() {
        System.out.println("Tomato:");
    }

    public Tomato(String variety) {
        this.variety = variety;
    }

    public Tomato(String variety, String color) {
        this(variety);
        this.color = color;
    }

    public Tomato(String variety, String color, float weight) {
        this(variety, color);
        this.weight = weight;
    }

    public Tomato(String variety, String color, float weight, boolean isOrganic) {
        this(variety, color, weight);
        this.isOrganic = isOrganic;
    }

    public Tomato(String variety, String color, float weight, boolean isOrganic, String origin) {
        this(variety, color, weight, isOrganic);
        this.origin = origin;
    }

    public Tomato(String variety, String color, float weight, boolean isOrganic, String origin, int shelfLife) {
        this(variety, color, weight, isOrganic, origin);
        this.shelfLife = shelfLife;
    }

    void display() {
        System.out.println("Variety: " + variety + "\nColor: " + color + "\nWeight: " + weight + " g\nOrganic: " + isOrganic +
                "\nOrigin: " + origin + "\nShelf Life: " + shelfLife + " days");
        System.out.println("============================");
    }
}
