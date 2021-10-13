/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bytesizebook.data.impl;

import com.bytesizebook.data.Hobby;

/**
 * A class that has a hobby. 
 * Implements the Hobby interface
 * 
 * @author timdowney
 */
public class HobbyImpl implements Hobby {
    
    /**
     *
     */
    protected String hobby;

    /**
     * Accessor for the hobby
     * @return
     */
    public String getHobby() {
        return hobby;
    }

    /**
     *
     * @param hobby
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    /**
     * Constructor with the hobby. 
     * @param hobby The hobby to set
     */
    public HobbyImpl(String hobby) {
        this.hobby = hobby;
    }
    
    
}
