class Holi {
    String festivalName;
    String date;
    String mainColor;
    boolean isPublicHoliday;
    int durationDays;
    String country;

    public Holi() {
        System.out.println("Holi:");
    }

    public Holi(String festivalName) {
        this.festivalName = festivalName;
    }

    public Holi(String festivalName, String date) {
        this(festivalName);
        this.date = date;
    }

    public Holi(String festivalName, String date, String mainColor) {
        this(festivalName, date);
        this.mainColor = mainColor;
    }

    public Holi(String festivalName, String date, String mainColor, boolean isPublicHoliday) {
        this(festivalName, date, mainColor);
        this.isPublicHoliday = isPublicHoliday;
    }

    public Holi(String festivalName, String date, String mainColor, boolean isPublicHoliday, int durationDays) {
        this(festivalName, date, mainColor, isPublicHoliday);
        this.durationDays = durationDays;
    }

    public Holi(String festivalName, String date, String mainColor, boolean isPublicHoliday, int durationDays, String country) {
        this(festivalName, date, mainColor, isPublicHoliday, durationDays);
        this.country = country;
    }

    void display() {
        System.out.println("Festival: " + festivalName + "\nDate: " + date + "\nMain Color: " + mainColor +
                "\nPublic Holiday: " + isPublicHoliday + "\nDuration: " + durationDays + " days\nCountry: " + country);
        System.out.println("============================");
    }
}
