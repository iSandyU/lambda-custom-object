package com.sandeepmane.lambdacustomobject.person.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class Person {
    
    private String name;

    private String age;

    private String city;
}