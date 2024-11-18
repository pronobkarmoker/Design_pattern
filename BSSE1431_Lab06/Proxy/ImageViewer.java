package BSSE1431_Lab06.Proxy;

// ImageViewer.java
import java.util.List;

public class ImageViewer {
    private List<ProxyImage> imageList;

    public ImageViewer(List<String> filenames) {
        // Initialize ProxyImage objects with filenames
        for (String filename : filenames) {
            imageList.add(new ProxyImage(filename));
        }
    }

    public void displayImages() {
        System.out.println("Image List:");
        for (int i = 0; i < imageList.size(); i++) {
            System.out.println(i + 1 + ". " + imageList.get(i).toString());
        }
    }

    public void selectImage(int index) {
        if (index >= 1 && index <= imageList.size()) {
            imageList.get(index - 1).display();
        } else {
            System.out.println("Invalid selection.");
        }
    }
}
