package chapter_4_ex_2.repositories;

import chapter_4_ex_2.models.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);
}
