package org.aop.practice8.services.pac1;

import org.springframework.stereotype.Component;

@Component
public class PackageService {
    public void packing() {
        System.out.println("Method from package");
    }
}
