package chapter_4_ex_1.proxies;

import chapter_4_ex_1.models.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        // simulates sending an email with current comment
        System.out.println(comment + "\nSending Email...");
    }
}
