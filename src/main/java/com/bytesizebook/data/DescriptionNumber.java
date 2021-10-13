/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bytesizebook.data;

/**
 * An interface that contains a numeric identifier and a string description.
 * 
 * @author timdowney
 */
public interface DescriptionNumber {    

    /**
     * Accessor for the identification number
     * 
     * @return  the number associated with the object
     */
    Long getNumber();

    /**
     * Mutator for the identification number
     * @param number    a number that identifies the object
     */
    void setNumber(Long number);
    
    /**
     * Accessor for the object description
     * 
     * @return  the description of the object
     */
    String getDescription();

    /**
     * Mutator for the object description
     * 
     * @param description   a string containing the description of the object.
     */
    void setDescription(String description);  
}
