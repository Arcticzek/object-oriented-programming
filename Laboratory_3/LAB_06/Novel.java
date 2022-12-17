public class Novel extends Book {
    private final String genre;

    public Novel(String title, String author, int numPages, String genre) {
        super(title, author, numPages);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}