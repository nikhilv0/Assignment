class Water {
    String source;
    float volume;
    boolean isDrinkable;
    float pHLevel;
    String mineralContent;
    boolean isBottled;

    public Water() {
        System.out.println("Water:");
    }

    public Water(String source) {
        this.source = source;
    }

    public Water(String source, float volume) {
        this(source);
        this.volume = volume;
    }

    public Water(String source, float volume, boolean isDrinkable) {
        this(source, volume);
        this.isDrinkable = isDrinkable;
    }

    public Water(String source, float volume, boolean isDrinkable, float pHLevel) {
        this(source, volume, isDrinkable);
        this.pHLevel = pHLevel;
    }

    public Water(String source, float volume, boolean isDrinkable, float pHLevel, String mineralContent) {
        this(source, volume, isDrinkable, pHLevel);
        this.mineralContent = mineralContent;
    }

    public Water(String source, float volume, boolean isDrinkable, float pHLevel, String mineralContent, boolean isBottled) {
        this(source, volume, isDrinkable, pHLevel, mineralContent);
        this.isBottled = isBottled;
    }

    void display() {
        System.out.println("Source: " + source + "\nVolume: " + volume + " L\nDrinkable: " + isDrinkable +
                "\npH Level: " + pHLevel + "\nMineral Content: " + mineralContent + "\nBottled: " + isBottled);
        System.out.println("============================");
    }
}
