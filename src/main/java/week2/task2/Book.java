package week2.task2;

//Поля класса: Кол-во страниц, разделы кол-во. Автор, название. переплет. ISBN. цена. Издание. год издания.

public class Book {

    private String name;
    private String author;
    private int numberOfPages;
    private int numberOfSection;
    private int edition;
    private int yearOfPublishing;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfSection() {
        return numberOfSection;
    }

    public void setNumberOfSection(int numberOfSection) {
        this.numberOfSection = numberOfSection;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", numberOfSection=" + numberOfSection +
                ", edition=" + edition +
                ", yearOfPublishing=" + yearOfPublishing +
                ", price=" + price +
                '}';
    }
}
