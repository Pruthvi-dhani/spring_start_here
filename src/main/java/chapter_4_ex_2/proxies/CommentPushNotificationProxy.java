package chapter_4_ex_2.proxies;

import chapter_4_ex_2.models.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PUSH")
public class CommentPushNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        // send push notification for current comment
        System.out.println(comment + "\nsending push comment notification");
    }
}
