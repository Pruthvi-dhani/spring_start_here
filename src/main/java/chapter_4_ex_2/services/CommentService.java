package chapter_4_ex_2.services;

import chapter_4_ex_2.models.Comment;
import chapter_4_ex_2.proxies.CommentNotificationProxy;
import chapter_4_ex_2.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    @Autowired
    public CommentService(CommentRepository commentRepository,
                          @Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        // store in DB
        commentRepository.storeComment(comment);
        // send mail
        commentNotificationProxy.sendComment(comment);
    }
}
