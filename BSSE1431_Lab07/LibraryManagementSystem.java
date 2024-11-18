package Miscellaneous;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Singleton: Configure library settings
        LibraryConfigManager configManager = LibraryConfigManager.getInstance();
        System.out.println("Library Hours: " + configManager.getLibraryHours());

        // Factory: Create library items
        LibraryItem book = LibraryItemFactory.createLibraryItem("book", "The Great Gatsby");
        LibraryItem magazine = LibraryItemFactory.createLibraryItem("magazine", "National Geographic");

        System.out.println(book.getDetails());
        System.out.println(magazine.getDetails());

        // Proxy: Access control
        User user = new User("Alice", false);
        LibraryAccess proxy = new LibraryAccessProxy();
        
        proxy.accessItem("restricted123", user); // Access denied
        proxy.accessItem("general456", user);   // Access granted
    }
}

