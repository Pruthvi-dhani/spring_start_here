package chapter_6_ex_4.services;

import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    // annotation order declared here doesn't matter, what matters is the number passed to @Order
    @ToSecurity
    @ToLog
    public String publishComment(Comment comment) {
        logger.info("Publising comment: " + comment);
        return "Success";
    }
}
