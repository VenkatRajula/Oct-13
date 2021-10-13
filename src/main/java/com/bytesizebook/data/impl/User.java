/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bytesizebook.data.impl;

import com.bytesizebook.data.FirstLast;


/**
 *
 * @author timdowney
 */
public class User implements FirstLast {

    String first;
    String last;
    
    public User() {}

    @Override
    public String getFirst() {
        return first;
    }

    @Override
    public void setFirst(String first) {
        this.first = first;
    }

    @Override
    public String getLast() {
        return last;
    }

    @Override
    public void setLast(String last) {
        this.last = last;
    }
   
    public String toString() {
        return String.format("User: %s, %s", getLast(), getFirst());
    }
    
}
