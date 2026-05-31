package org.aop.practice9.services.filtered;

import org.springframework.stereotype.Component;

@Component
public class PackageService {
    public void packageCall () {
        System.out.println("message from package");
    }
}
