/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bytesizebook.data.impl;


import com.bytesizebook.data.DescriptionNumber;
import org.springframework.stereotype.Component;

/**
 *
 * @author timdowney
 */
@Component
public class Automobile implements DescriptionNumber {
    
    private Long number;
    private String description;

    @Override
    public Long getNumber() {
        return number;
    }

    @Override
    public void setNumber(Long number) {
        this.number = number;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
        return String.format("Automobile: %s (%d)", getDescription(), getNumber());
    }
    
}
