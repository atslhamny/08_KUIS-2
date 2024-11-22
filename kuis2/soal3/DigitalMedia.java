package soal3;

abstract class DigitalMedia {
    protected String title;
    protected String creator;
    protected int releaseYear;

    public DigitalMedia(String title, String creator, int releaseYear) {
        this.title = title;
        this.creator = creator;
        this.releaseYear = releaseYear;
    }

    public abstract void play();

    public abstract String getMediaInfo();
}
