package org.aop.practice2.today8;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan ("org.aop.practice2.today8")
@EnableAspectJAutoProxy
public class MyConfig {
}
