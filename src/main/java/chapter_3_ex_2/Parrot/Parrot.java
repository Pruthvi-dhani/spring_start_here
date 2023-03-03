package chapter_3_ex_2.Parrot;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " Parrot";
    }
}
