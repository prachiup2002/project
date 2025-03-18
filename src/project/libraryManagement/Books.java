package project.libraryManagement;

public class Books {
    private int bookId;
    private String bookName;
    private String authorName;
    private int perDayRent;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPerDayRent() {
        return perDayRent;
    }

    public void setPerDayRent(int perDayRent) {
        this.perDayRent = perDayRent;
    }

    public Books(int bookId, String bookName, String authorName, int perDayRent) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.perDayRent = perDayRent;
    }
}
