package soal3;

public class DigitalLibraryDemo {
    public static void main(String[] args) {
        // Membuat objek perpustakaan
        DigitalLibrary library = new DigitalLibrary();

        // Membuat berbagai jenis media
        EBook ebook = new EBook("Java Programming", "John Doe", 2023, 500, "PDF");
        AudioBook audioBook = new AudioBook("Leadership 101", "Jane Smith", 2022, 180, "Mike Johnson");
        VideoCourse videoCourse = new VideoCourse("Web Development", "Alice Brown", 2023, "Programming", 12);

        // Demonstrasi Heterogeneous Collection
        System.out.println("=== Demonstrasi Heterogeneous Collection ===");
        DigitalMedia[] mediaCollection = { ebook, audioBook, videoCourse };

        for (DigitalMedia media : mediaCollection) {
            System.out.println("\nMemainkan media:");
            media.play();
            System.out.println("Info media: " + media.getMediaInfo());
        }

        // Demonstrasi Polymorphic Arguments
        System.out.println("\n=== Demonstrasi Polymorphic Arguments ===");
        library.addToFavorites(ebook);
        library.addToFavorites(audioBook);
        library.addToFavorites(videoCourse);

        // Demonstrasi Object Casting dan InstanceOf
        System.out.println("\n=== Demonstrasi Object Casting dan InstanceOf ===");
        library.processMedia(ebook);
        library.processMedia(audioBook);
        library.processMedia(videoCourse);
    }
}
