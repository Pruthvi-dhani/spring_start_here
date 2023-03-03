package chapter_3_ex_3.Main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
    private final Parrot parrot;

    @Autowired
    public Person(Parrot parrot) {
        // dependency injection with Spring annotion, spring automatically supplies
        // the parrot instance when creating this class
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    @Override
    public String toString() {
        return "Person: " + name;
    }
}
