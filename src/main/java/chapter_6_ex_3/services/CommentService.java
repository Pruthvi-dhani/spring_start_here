package chapter_6_ex_3.services;

import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public String publishComment(Comment comment) {
        logger.info("Publishing Comment:\n" + comment);
        return "SUCCESS";
    }

    public String editComment(Comment comment) {
        logger.info("Editing Comment:\n" + comment);
        return "SUCCESS";
    }

    @ToLog
    public String deleteComment(Comment comment) {
        logger.info("Deleting Comment:\n" + comment);
        return "SUCCESS";
    }
}
