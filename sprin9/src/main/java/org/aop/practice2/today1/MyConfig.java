package org.aop.practice2.today1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration ()
@ComponentScan("org.practice2.today1")
@EnableAspectJAutoProxy
public class MyConfig {
}
