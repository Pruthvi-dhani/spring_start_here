package chapter_4_ex_2.proxies;

import chapter_4_ex_2.models.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
