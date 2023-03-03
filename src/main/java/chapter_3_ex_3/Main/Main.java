package chapter_3_ex_3.Main;

import chapter_3_ex_3.ProjectConfig.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        person.setName("abc");
        Parrot parrot = context.getBean(Parrot.class);
        parrot.setName("def");
        // parrot
        System.out.println(parrot);
        // person
        System.out.println(person);
        // person's parrot automatically set by spring
        System.out.println(person.getParrot());
    }
}
