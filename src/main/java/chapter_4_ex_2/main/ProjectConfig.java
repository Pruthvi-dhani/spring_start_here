package chapter_4_ex_2.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"chapter_4_ex_2.proxies", "chapter_4_ex_2.repositories", "chapter_4_ex_2.services"})
public class ProjectConfig {

}
