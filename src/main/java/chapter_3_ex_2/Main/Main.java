package chapter_3_ex_2.Main;

import chapter_3_ex_2.Person.Person;
import chapter_3_ex_2.ProjectConfig.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person p = context.getBean(Person.class);
        p.setName("Someone");
        p.getParrot().setName("SomeParrot");
        // person
        System.out.println(p);
        // person's parrot
        System.out.println(p.getParrot());
    }
}
