package chapter_4_ex_1.proxies;

import chapter_4_ex_1.models.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
