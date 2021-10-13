/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bytesizebook.data.impl;

import com.bytesizebook.data.Name;

/**
 * A class that has a name.
 * Implements the Name interface.
 * 
 * @author timdowney
 */
public class NameImpl implements Name {

    /**
     * The name for the class.
     */
    protected String name;
    
    /**
     * A class with an identification number and description.
     * Implements DescriptionNumber.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    /**
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Constructor with the name.
     * 
     * @param name
     */
    public NameImpl(String name) {
        this.name = name;
    }
    
    
}
