package chapter_6_ex_1.services;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment) {
        // use the java std logging library to log info
        // note that we are not using aspects yet for logging
        logger.info("Publishing Comment:\n" + comment);
    }
}
