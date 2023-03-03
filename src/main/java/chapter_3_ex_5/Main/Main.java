package chapter_3_ex_5.Main;

import chapter_3_ex_5.ProjectConfig.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person p = context.getBean(Person.class);
        // person
        p.setName("abc");
        System.out.println(p);
        // person's parrot
        System.out.println(p.getParrot());
    }
}
