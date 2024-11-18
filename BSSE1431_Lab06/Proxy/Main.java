package BSSE1431_Lab06.Proxy;

// Main.java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ImageViewer viewer = new ImageViewer(Arrays.asList("image1.jpg", "image2.jpg", "image3.jpg"));

        viewer.displayImages(); // Show the list of images

        viewer.selectImage(2); // Select and display the 2nd image
    }
}
