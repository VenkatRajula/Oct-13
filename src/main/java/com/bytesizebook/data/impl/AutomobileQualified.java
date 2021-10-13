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
 * An automobile class with a non-default component name that can be used
 * to identify this particular class. 
 * Implements DescriptionNumber.
 * 
 * @author timdowney
 */
@Component("car")
public class AutomobileQualified implements DescriptionNumber {
    
    private Long number;
    private String description;

    /**
     * Accessor for identification number
     * @return
     */
    @Override
    public Long getNumber() {
        return number;
    }

    /**
     * Mutator for identification number
     * @param number
     */
    @Override
    public void setNumber(Long number) {
        this.number = number;
    }

    /**
     * Accessor for object description
     * @return
     */
    @Override
    public String getDescription() {
        return description;
    }

    /**
     * Mutator for object description
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
