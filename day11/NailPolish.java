class NailPolish {
    String brand;
    String color;
    int volume;
    boolean isQuickDry;
    float price;
    boolean isMatte;

    public NailPolish() {
        System.out.println("NailPolish:");
    }

    public NailPolish(String brand) {
        this.brand = brand;
    }

    public NailPolish(String brand, String color) {
        this(brand);
        this.color = color;
    }

    public NailPolish(String brand, String color, int volume) {
        this(brand, color);
        this.volume = volume;
    }

    public NailPolish(String brand, String color, int volume, boolean isQuickDry) {
        this(brand, color, volume);
        this.isQuickDry = isQuickDry;
    }

    public NailPolish(String brand, String color, int volume, boolean isQuickDry, float price) {
        this(brand, color, volume, isQuickDry);
        this.price = price;
    }

    public NailPolish(String brand, String color, int volume, boolean isQuickDry, float price, boolean isMatte) {
        this(brand, color, volume, isQuickDry, price);
        this.isMatte = isMatte;
    }
	void display() {
    System.out.println("Brand: " + brand + "\nColor: " + color + "\nVolume: " + volume + "ml\nQuick Dry: " + (isQuickDry ? "Yes" : "No") + "\nPrice: ₹" + price + "\nMatte Finish: " + (isMatte ? "Yes" : "No"));
	System.out.println("============================");
}

}
