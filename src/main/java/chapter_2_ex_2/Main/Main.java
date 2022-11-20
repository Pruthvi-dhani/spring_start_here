package chapter_2_ex_2.Main;

import chapter_2_ex_2.ProjectConfig.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot1 s = new Parrot1();
        s.setName("Kiki");
        Supplier<Parrot1> parrot1Supplier = () -> s;
        context.registerBean("parrot1", Parrot1.class, parrot1Supplier);

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
        Parrot1 p1 = context.getBean(Parrot1.class);
        System.out.println(p1.getName());

    }
}
