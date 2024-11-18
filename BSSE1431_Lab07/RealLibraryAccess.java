package Miscellaneous;

public class RealLibraryAccess implements LibraryAccess {
    @Override
    public boolean accessItem(String itemID, User user) {
        System.out.println("Access granted to item: " + itemID);
        return true;
    }
}

