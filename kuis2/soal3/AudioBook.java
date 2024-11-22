package soal3;

class AudioBook extends DigitalMedia {
    private int durationMinutes;
    private String narrator;

    public AudioBook(String title, String creator, int releaseYear,
            int durationMinutes, String narrator) {
        super(title, creator, releaseYear);
        this.durationMinutes = durationMinutes;
        this.narrator = narrator;
    }

    @Override
    public void play() {
        System.out.println("Memutar AudioBook: " + title + " - Dibacakan oleh " + narrator);
    }

    @Override
    public String getMediaInfo() {
        return String.format("AudioBook: %s oleh %s (%d) - Durasi: %d menit",
                title, creator, releaseYear, durationMinutes);
    }

    // Method khusus AudioBook
    public void adjustPlaybackSpeed(double speed) {
        System.out.println("Mengubah kecepatan pemutaran menjadi " + speed + "x");
    }
}
