package chapter_4_ex_1.repositories;

import chapter_4_ex_1.models.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);
}
