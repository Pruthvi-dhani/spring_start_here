package chapter_6_ex_3.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "chapter_6_ex_3.services")
@EnableAspectJAutoProxy
public class ProjectConfig {

}
