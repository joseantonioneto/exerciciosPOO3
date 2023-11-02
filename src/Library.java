import java.util.ArrayList;
import java.util.List;
public class Library {
    private String name;
    private Manager manager;
    private List<Book> books;
    private List<Map> maps;
    private List<Periodical> periodicals;
    private List<User> users;

    public Library(String name, Manager manager){
        this.name = name;
        this.manager = manager;
        books = new ArrayList<Book>();
        maps = new ArrayList<Map>();
        periodicals = new ArrayList<Periodical>();
        users = new ArrayList<User>();
    }
    public void registerBook(Book book) {
        books.add(book);
    }
    public void registerMap(Map map) {
        maps.add(map);
    }
    public void registerPeriodical(Periodical periodical) {
        periodicals.add(periodical);
    }
    public void registerUser(User user) {
        users.add(user);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Map> getMaps() {
        return maps;
    }

    public void setMaps(List<Map> maps) {
        this.maps = maps;
    }

    public List<Periodical> getPeriodicals() {
        return periodicals;
    }

    public void setPeriodicals(List<Periodical> periodicals) {
        this.periodicals = periodicals;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
