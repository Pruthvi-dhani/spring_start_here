package chapter_2_ex_1.ProjectConfig;

import chapter_2_ex_1.Parrot.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    // we can add multiple objects of the same type to a spring context
    @Bean
    @Primary
    Parrot parrot() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    Parrot parrot1() {
        var p = new Parrot();
        p.setName("Mimi");
        return p;
    }

    @Bean
    Integer ten() {
        return 10;
    }

    @Bean
    String helloString() {
        return "Hello!";
    }
}
