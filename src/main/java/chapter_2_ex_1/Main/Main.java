package chapter_2_ex_1.Main;

import chapter_2_ex_1.Parrot.Parrot;
import chapter_2_ex_1.ProjectConfig.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p = context.getBean("parrot", Parrot.class);
        System.out.println(p.getName());
        Parrot p1 = context.getBean("parrot1", Parrot.class);
        System.out.println(p1.getName());
        Integer i = context.getBean(Integer.class);
        System.out.println(i);
        String s = context.getBean(String.class);
        System.out.println(s);
    }

}
