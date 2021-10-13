/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bytesizebook.data.impl;

import com.bytesizebook.data.FirstLast;


/**
 * A class that has a first and last name.
 * Implements the FirstLast interface.
 * 
 * @author timdowney
 */
public class Client implements FirstLast {
    
    String first;
    String last;
    
    /**
     * Default constructor
     */
    public Client() {}

    /**
     * Accessor for the first name
     * @return
     */
    @Override
    public String getFirst() {
        return first;
    }

    /**
     * Mutator for first name
     * @param first
     */
    @Override
    public void setFirst(String first) {
        this.first = first;
    }

    /**
     * Accessor for the last name
     * @return
     */
    @Override
    public String getLast() {
        return last;
    }

    /**
     * Mutator for last name
     * @param last
     */
    @Override
    public void setLast(String last) {
        this.last = last;
    }
    
    public String toString() {
        return String.format("Client: %s, %s", getLast(), getFirst());
    }
    
}
