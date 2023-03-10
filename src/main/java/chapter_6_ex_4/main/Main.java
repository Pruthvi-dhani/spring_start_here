package chapter_6_ex_4.main;

import chapter_6_ex_4.services.Comment;
import chapter_6_ex_4.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = context.getBean(CommentService.class);
        Comment firstComment = new Comment();
        firstComment.setComment("Hello World!");
        firstComment.setAuthor("abc");
        service.publishComment(firstComment);
    }
}
