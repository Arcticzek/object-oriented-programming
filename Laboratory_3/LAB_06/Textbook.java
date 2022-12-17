public class Textbook extends Book {
    private final String subject;

    public Textbook(String title, String author, int numPages, String subject) {
        super(title, author, numPages);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}