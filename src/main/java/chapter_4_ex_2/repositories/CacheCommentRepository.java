package chapter_4_ex_2.repositories;

import chapter_4_ex_2.models.Comment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CacheCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println(comment + "\nStoring in Cache...");
    }
}
