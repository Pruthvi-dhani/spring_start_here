package chapter_4_ex_1.services;

import chapter_4_ex_1.models.Comment;
import chapter_4_ex_1.proxies.CommentNotificationProxy;
import chapter_4_ex_1.repositories.CommentRepository;

public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        // store in DB
        commentRepository.storeComment(comment);
        // send Email
        commentNotificationProxy.sendComment(comment);
    }
}
