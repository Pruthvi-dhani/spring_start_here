package chapter_3_ex_2.Person;

import chapter_3_ex_2.Parrot.Parrot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;

    @Autowired
    private Parrot parrot;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    @Override
    public String toString() {
        return this.name + " Person";
    }
}
