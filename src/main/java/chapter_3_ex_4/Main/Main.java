package chapter_3_ex_4.Main;

import chapter_3_ex_4.ProjectConfig.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person p = context.getBean("person1", Person.class);
        // person1
        System.out.println(p);
        // person's parrot
        System.out.println(p.getParrot());
        // person2
        Person p2 = context.getBean("person2", Person.class);
        System.out.println(p2);
        // person2's parrot
        System.out.println(p2.getParrot());
    }
}
