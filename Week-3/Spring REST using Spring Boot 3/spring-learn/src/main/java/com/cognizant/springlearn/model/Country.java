package com.cognizant.springlearn.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Country {

    @NotBlank(message = "Country code is mandatory")
    @Size(min = 2, max = 2, message = "Country code must be exactly 2 characters")
    private String code;

    @NotBlank(message = "Country name is mandatory")
    private String name;

    public Country() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}