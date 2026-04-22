package org.aop.practice7.entity.p1;

import org.springframework.stereotype.Component;

@Component
public class PackageService {
    public void processPackage () {
        System.out.println("package method from PackageService class and p1 folder");
    }
}
