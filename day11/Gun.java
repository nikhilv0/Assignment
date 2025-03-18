class Gun {
    String type;
    String model;
    float caliber;
    int magazineCapacity;
    String manufacturer;
    boolean isAutomatic;

    public Gun() {
        System.out.println("Gun:");
    }

    public Gun(String type) {
        this.type = type;
    }

    public Gun(String type, String model) {
        this(type);
        this.model = model;
    }

    public Gun(String type, String model, float caliber) {
        this(type, model);
        this.caliber = caliber;
    }

    public Gun(String type, String model, float caliber, int magazineCapacity) {
        this(type, model, caliber);
        this.magazineCapacity = magazineCapacity;
    }

    public Gun(String type, String model, float caliber, int magazineCapacity, String manufacturer) {
        this(type, model, caliber, magazineCapacity);
        this.manufacturer = manufacturer;
    }

    public Gun(String type, String model, float caliber, int magazineCapacity, String manufacturer, boolean isAutomatic) {
        this(type, model, caliber, magazineCapacity, manufacturer);
        this.isAutomatic = isAutomatic;
    }

    void display() {
        System.out.println("Type: " + type + "\nModel: " + model + "\nCaliber: " + caliber + " mm" +
                "\nMagazine Capacity: " + magazineCapacity + "\nManufacturer: " + manufacturer + "\nAutomatic: " + isAutomatic);
        System.out.println("============================");
    }
}
