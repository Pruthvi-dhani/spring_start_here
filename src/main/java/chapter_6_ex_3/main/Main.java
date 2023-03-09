package chapter_6_ex_3.main;

import chapter_6_ex_3.services.Comment;
import chapter_6_ex_3.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = context.getBean(CommentService.class);
        Comment firstComment = new Comment();
        firstComment.setComment("hello world!");
        firstComment.setAuthor("abc");
        Comment secondComment = new Comment();
        secondComment.setComment("hello motto!");
        secondComment.setAuthor("def");
        service.publishComment(firstComment);
        service.publishComment(secondComment);
        service.editComment(firstComment);
        service.deleteComment(firstComment);
    }
}
