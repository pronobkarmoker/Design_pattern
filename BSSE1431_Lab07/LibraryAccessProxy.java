package Miscellaneous;

public class LibraryAccessProxy implements LibraryAccess {
    private RealLibraryAccess realLibraryAccess = new RealLibraryAccess();

    @Override
    public boolean accessItem(String itemID, User user) {
        if (user.hasAccessPermission(itemID)) {
            return realLibraryAccess.accessItem(itemID, user);
        } else {
            System.out.println("Access denied for item: " + itemID);
            return false;
        }
    }
}
