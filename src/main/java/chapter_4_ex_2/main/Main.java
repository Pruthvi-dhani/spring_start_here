package chapter_4_ex_2.main;

import chapter_4_ex_2.models.Comment;
import chapter_4_ex_2.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // spring creates the instances and automatically establishes relationships among them for us
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var firstComment = new Comment();
        firstComment.setComment("Hello World!");
        firstComment.setAuthor("abc");
        var secondComment = new Comment();
        secondComment.setComment("Hello Motto!");
        secondComment.setAuthor("def");
        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(firstComment);
        commentService.publishComment(secondComment);
    }
}
