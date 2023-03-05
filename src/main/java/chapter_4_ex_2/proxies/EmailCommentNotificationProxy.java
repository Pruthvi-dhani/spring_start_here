package chapter_4_ex_2.proxies;

import chapter_4_ex_2.models.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("EMAIL")
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        // simulates sending email notification for current comment
        System.out.println(comment + "\nSending email...");
    }
}
