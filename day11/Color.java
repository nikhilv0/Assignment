class Color {
    String name;
    String shade;
    boolean isOrganic;
    String composition;
    int quantity;
    String price;

    public Color() {
        System.out.println("Color:");
    }

    public Color(String name) {
        this.name = name;
    }

    public Color(String name, String shade) {
        this(name);
        this.shade = shade;
    }

    public Color(String name, String shade, boolean isOrganic) {
        this(name, shade);
        this.isOrganic = isOrganic;
    }

    public Color(String name, String shade, boolean isOrganic, String composition) {
        this(name, shade, isOrganic);
        this.composition = composition;
    }

    public Color(String name, String shade, boolean isOrganic, String composition, int quantity) {
        this(name, shade, isOrganic, composition);
        this.quantity = quantity;
    }

    public Color(String name, String shade, boolean isOrganic, String composition, int quantity, String price) {
        this(name, shade, isOrganic, composition, quantity);
        this.price = price;
    }

    void display() {
        System.out.println("Color: " + name + "\nShade: " + shade + "\nOrganic: " + isOrganic +
                "\nComposition: " + composition + "\nQuantity: " + quantity + " g\nPrice: $" + price);
        System.out.println("============================");
    }
}
