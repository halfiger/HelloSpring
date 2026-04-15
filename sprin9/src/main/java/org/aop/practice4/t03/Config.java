package org.aop.practice4.t03;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("org.aop.practice4.t03")
@EnableAspectJAutoProxy
public class Config {
}
