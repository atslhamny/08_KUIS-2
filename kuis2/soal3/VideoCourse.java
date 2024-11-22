package soal3;

class VideoCourse extends DigitalMedia {
    private String subject;
    private int numberOfLessons;

    public VideoCourse(String title, String creator, int releaseYear,
            String subject, int numberOfLessons) {
        super(title, creator, releaseYear);
        this.subject = subject;
        this.numberOfLessons = numberOfLessons;
    }

    @Override
    public void play() {
        System.out.println("Memutar Video Course: " + title + " - " + subject);
    }

    @Override
    public String getMediaInfo() {
        return String.format("Video Course: %s oleh %s (%d) - %s, %d pelajaran",
                title, creator, releaseYear, subject, numberOfLessons);
    }

    // Method khusus VideoCourse
    public void downloadTranscript() {
        System.out.println("Mengunduh transkrip untuk " + title);
    }
}