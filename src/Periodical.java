public class Periodical implements ILibraryArtifact{
    private String title;
    private Author author;
    private int publicationYear;
    private int available;
    private String journal;

    public Periodical(String title, Author author, int publicationYear, int available, String journal) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.available = available;
        this.journal = journal;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public Author getAuthor() {
        return author;
    }

    @Override
    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean isAvailableForLoan() {
        return available >= 1;
    }

    public int getAvailable() {
        return available;
    }

    public String getJournal() {
        return journal;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }
}
