package chapter_2_ex_2.Main;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class Parrot {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @PostConstruct
    public void init() {
        this.name = "Mimi";
    }
}