package soal3;

class DigitalLibrary {
    // Method dengan Polymorphic Arguments
    public void addToFavorites(DigitalMedia media) {
        System.out.println("Menambahkan ke favorit: " + media.getMediaInfo());
    }

    // Method yang menggunakan Object Casting dan InstanceOf
    public void processMedia(DigitalMedia media) {
        System.out.println("\nMemproses media...");

        // Menggunakan instanceof untuk pengecekan tipe
        if (media instanceof EBook) {
            EBook ebook = (EBook) media; // Object Casting
            System.out.println("Ini adalah E-Book");
            ebook.searchContent("keyword");
        } else if (media instanceof AudioBook) {
            AudioBook audioBook = (AudioBook) media; // Object Casting
            System.out.println("Ini adalah AudioBook");
            audioBook.adjustPlaybackSpeed(1.5);
        } else if (media instanceof VideoCourse) {
            VideoCourse videoCourse = (VideoCourse) media; // Object Casting
            System.out.println("Ini adalah Video Course");
            videoCourse.downloadTranscript();
        }
    }
}
