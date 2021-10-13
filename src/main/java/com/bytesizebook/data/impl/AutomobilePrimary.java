/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bytesizebook.data.impl;

import com.bytesizebook.data.DescriptionNumber;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * An automobile class that has the Primary annotation, which makes this the
 * default class that implements the interface if a qualified name is not used.
 * Implements DescriptionNumber
 * 
 * @author timdowney
 */
@Component
@Primary
public class AutomobilePrimary implements DescriptionNumber {
    
    private Long number;
    private String description;

    /**
     * Accessor for the identification number
     * @return
     */
    @Override
    public Long getNumber() {
        return number;
    }

    /**
     *
     * @param number
     */
    @Override
    public void setNumber(Long number) {
        this.number = number;
    }

    /**
     * Accessor for the description of the object.
     * @return
     */
    @Override
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    @Override
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
        return String.format("Automobile: %s (%d)", getDescription(), getNumber());
    }
    
}
