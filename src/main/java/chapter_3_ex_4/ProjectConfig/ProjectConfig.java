package chapter_3_ex_4.ProjectConfig;

import chapter_3_ex_4.Main.Parrot;
import chapter_3_ex_4.Main.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Mimi");
        return p;
    }

    @Bean
    public Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Kiki");
        return p;
    }

    @Bean
    public Person person1(Parrot parrot2) {
        Person p = new Person();
        p.setName("abc");
        p.setParrot(parrot2);
        return p;
    }

    @Bean
    public Person person2(@Qualifier("parrot1") Parrot parrot) {
        // use qualifier to explicitly define which parrot bean to use
        Person p = new Person();
        p.setName("def");
        p.setParrot(parrot);
        return p;
    }
}
