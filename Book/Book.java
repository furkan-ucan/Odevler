package Book;


public class Book implements Comparable<Book> {
    private String name;
    private int pages;
    private String author;
    private int publishedDate;

    public Book(String name, int pages, String author, int publishedDate) {
        this.name = name;
        this.pages = pages;
        this.author = author;
        this.publishedDate = publishedDate;
    }

    public String getName() {
        return name;
    }
    
    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishedDate() {
        return publishedDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishedDate(int publishedDate) {
        this.publishedDate = publishedDate;
    }

    @Override
    public int compareTo(Book book) {
        return this.name.compareTo(book.name);
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", pages=" + pages + ", author=" + author + ", publishedDate=" + publishedDate
                + "]";
    }


}
