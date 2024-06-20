package com.demoqa.enams;

import com.demoqa.elements.TextBox;
import lombok.Getter;

public enum Endpoints {
    ALERT("/alerts"),
    FRAMES("/frames"),
TEXTBOX("/text-box"),
    BUTTON ("/button");
    @Getter
    String endpoint;

    Endpoints(String endpoint){
        this.endpoint = endpoint;

    }


}
