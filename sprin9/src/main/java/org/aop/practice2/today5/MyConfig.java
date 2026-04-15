package org.aop.practice2.today5;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan("org.practice2.today5")
public class MyConfig {
}
