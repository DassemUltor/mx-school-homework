package lesson06_02;

public class Book {

    private String titleBook;
    private Integer yearRelease;
    private Author author;

    public Book(String titleBook, Integer yearRelease, Author author) {
        this.titleBook = titleBook;
        this.yearRelease = yearRelease;
        this.author = author;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public Integer getYearRelease() {
        return yearRelease;
    }

    public Author getAuthor() {
        return author;
    }


    public void setYearRelease(Integer yearRelease) {
        this.yearRelease = yearRelease;
    }


    @Override
    public String toString() {
        return "Book{" +
                "titleBook='" + titleBook + '\'' +
                ", yearRelease=" + yearRelease +
                ", author=" + author +
                '}';
    }


}
