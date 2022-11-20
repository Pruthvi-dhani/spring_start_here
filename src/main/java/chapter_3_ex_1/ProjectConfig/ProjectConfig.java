package chapter_3_ex_1.ProjectConfig;

import chapter_3_ex_1.Parrot.Parrot;
import chapter_3_ex_1.Person.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class ProjectConfig {

    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("kiki");
        return p;
    }

    @Bean
    @Primary
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("mimi");
        return p;
    }

    @Bean
    @Primary
    public Person person(Parrot parrot) {
        Person p = new Person();
        p.setName("nick");
        // define has a relationship b/w person and parrot
        p.setParrot(parrot);
        return p;
    }
}
