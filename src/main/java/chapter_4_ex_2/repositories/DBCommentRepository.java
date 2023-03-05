package chapter_4_ex_2.repositories;

import chapter_4_ex_2.models.Comment;
import org.springframework.stereotype.Component;

// use spring to do dependency injection
@Component
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        // simulates storing current comment in a DB
        System.out.println(comment + "\nStoring in DB...");
    }
}
