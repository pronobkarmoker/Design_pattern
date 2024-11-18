package Miscellaneous;

public class LibraryItemFactory {
    public static LibraryItem createLibraryItem(String itemType, String title) {
        switch (itemType.toLowerCase()) {
            case "book":
                return new Book(title);
            case "magazine":
                return new Magazine(title);
            default:
                throw new IllegalArgumentException("Invalid item type: " + itemType);
        }
    }
}
