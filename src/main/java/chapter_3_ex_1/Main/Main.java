package chapter_3_ex_1.Main;

import chapter_3_ex_1.Parrot.Parrot;
import chapter_3_ex_1.Person.Person;
import chapter_3_ex_1.ProjectConfig.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(person.getName());
        System.out.println(parrot.getName());
        // has a relationship b/w person and parrot
        System.out.println(person.getParrot());

    }
}
