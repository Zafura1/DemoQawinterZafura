package com.demoqa.elements.entities;

import lombok.*;
import org.openqa.selenium.WebElement;


@Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    @EqualsAndHashCode
    @Builder
    public class PracticFormEntity {

    private String fullName;
    private String lastName;
    private String email;
    private WebElement gender;
    private long mobileNumber;

    private String subject;
    private String currentAddress;
}
