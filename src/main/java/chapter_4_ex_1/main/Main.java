package chapter_4_ex_1.main;

import chapter_4_ex_1.models.Comment;
import chapter_4_ex_1.proxies.EmailCommentNotificationProxy;
import chapter_4_ex_1.repositories.DBCommentRepository;
import chapter_4_ex_1.services.CommentService;

public class Main {

    public static void main(String[] args) {
        // manually create the instances and establish relations among them
        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();
        var commentService = new CommentService(commentRepository, commentNotificationProxy);
        Comment firstComment = new Comment();
        firstComment.setComment("Hello World!");
        firstComment.setAuthor("abc");
        Comment secondComment = new Comment();
        secondComment.setComment("Hello Moto!");
        secondComment.setAuthor("def");
        // publish the first and second comments
        commentService.publishComment(firstComment);
        commentService.publishComment(secondComment);
    }
}
