package soal3;

class EBook extends DigitalMedia {
    private int pages;
    private String format; // PDF, EPUB, etc.

    public EBook(String title, String creator, int releaseYear, int pages, String format) {
        super(title, creator, releaseYear);
        this.pages = pages;
        this.format = format;
    }

    @Override
    public void play() {
        System.out.println("Membuka E-Book: " + title + " dengan format " + format);
    }

    @Override
    public String getMediaInfo() {
        return String.format("E-Book: %s oleh %s (%d) - %d halaman",
                title, creator, releaseYear, pages);
    }

    // Method khusus EBook
    public void searchContent(String keyword) {
        System.out.println("Mencari kata '" + keyword + "' dalam e-book " + title);
    }
}