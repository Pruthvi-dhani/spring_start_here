package chapter_4_ex_1.repositories;

import chapter_4_ex_1.models.Comment;

public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        // simulates storing comment in DB
        System.out.println(comment + "\nStored in DB...");
    }
}
