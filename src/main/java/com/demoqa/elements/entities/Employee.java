package com.demoqa.elements.entities;

import lombok.*;



    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    @Builder
    @EqualsAndHashCode
    public class Employee {

    private  String firstName;
    private String lastName;
    private int age;
    private String email;
    private long salary;
    private String department;

}
