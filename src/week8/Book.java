package week8;

public class Book {

    private String name;
    private int publishingYear;

    public Book(String name, int publishingYear) {
        this.name = name;
        this.publishingYear = publishingYear;
    }

    public String getName() {
        return this.name;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }
    // to string meetod
    @Override
    public String toString() {
        return this.name + " " + this.publishingYear;
    }
}

