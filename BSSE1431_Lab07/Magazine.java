package Miscellaneous;

public class Magazine implements LibraryItem {
    private String title;
    private boolean isBorrowed;

    public Magazine(String title) {
        this.title = title;
        this.isBorrowed = false;
    }

    @Override
    public String getDetails() {
        return "Magazine: " + title;
    }

    @Override
    public boolean borrowItem() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("Borrowed: " + title);
            return true;
        } else {
            System.out.println(title + " is already borrowed.");
            return false;
        }
    }
}

