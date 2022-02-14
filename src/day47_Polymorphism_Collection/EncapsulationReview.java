package day47_Polymorphism_Collection;

public class EncapsulationReview {

    private String bookTitle;
    private final String publishDate;

    public EncapsulationReview(String bookTitle) {
        this.bookTitle = bookTitle;
        this.publishDate = getPublishDate();
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getPublishDate() {
        return publishDate;
    }


}
