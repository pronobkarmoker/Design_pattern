package Miscellaneous;

public class LibraryConfigManager {
    private static LibraryConfigManager instance;
    private double lateFees;
    private int borrowingLimit;
    private String libraryHours;

    private LibraryConfigManager() {
        // Default settings
        this.lateFees = 0.50;
        this.borrowingLimit = 5;
        this.libraryHours = "9 AM - 5 PM";
    }

    public static synchronized LibraryConfigManager getInstance() {
        if (instance == null) {
            instance = new LibraryConfigManager();
        }
        return instance;
    }

    public double getLateFees() {
        return lateFees;
    }

    public void setLateFees(double lateFees) {
        this.lateFees = lateFees;
    }

    public int getBorrowingLimit() {
        return borrowingLimit;
    }

    public void setBorrowingLimit(int borrowingLimit) {
        this.borrowingLimit = borrowingLimit;
    }

    public String getLibraryHours() {
        return libraryHours;
    }

    public void setLibraryHours(String libraryHours) {
        this.libraryHours = libraryHours;
    }
}
