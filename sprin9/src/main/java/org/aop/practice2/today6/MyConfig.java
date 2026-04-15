package org.aop.practice2.today6;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("org.practice2.today6")
@EnableAspectJAutoProxy
public class MyConfig {
}
