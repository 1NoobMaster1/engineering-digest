package com.edigest.myFirstProject;

import org.springframework.stereotype.Component;

/*
   SpringBoot Framework will not Scan this Class 'Dog';
   Because it's outside the package.
*/
@Component
public class Dog {
    public String fun() {
        return "Something!";
    }
}
