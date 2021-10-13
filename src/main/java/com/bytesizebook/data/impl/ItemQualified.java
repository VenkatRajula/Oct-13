/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bytesizebook.data.impl;

import com.bytesizebook.data.DescriptionNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * A class with an identification number and description.
 * Implements DescriptionNumber.
 * 
 * @author timdowney
 */
@Component("widget")
public class ItemQualified implements DescriptionNumber {

/* This comment section can be removed. It was needed to generate the archetype.

*/
    @Value("${number:0}")
    Long number;
    @Value("${description:Convertible Cadirock}")
    String description;
/* This comment section can be removed. It was needed to generate the archetype.

*/

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
     * Accessor of object description
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
        return String.format("Item (qualified): %s (%d)", getDescription(), getNumber());
    }
    
}
