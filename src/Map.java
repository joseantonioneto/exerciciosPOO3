public class Map implements ILibraryArtifact{
    private String title;
    private Author author;
    private int publicationYear;
    private int available;
    private int scale;

    public Map(String title, Author author, int publicationYear, int available,int scale) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.available = available;
        this.scale = scale;
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

    public int getScale() {
        return scale;
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

    public void setScale(int scale) {
        this.scale = scale;
    }
}
