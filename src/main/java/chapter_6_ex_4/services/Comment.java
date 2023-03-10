package chapter_6_ex_4.services;

public class Comment {

    private String author;
    private String comment;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Author: " + author + ", Comment: " + comment;
    }
}
