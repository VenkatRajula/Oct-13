/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bytesizebook.data;

/**
 *
 * @author timdowney
 */
public interface FirstLast {   

    /**
     *
     * @return  the first name
     */
    String getFirst();

    /**
     *
     * @param first a string containing the first name
     */
    void setFirst(String first);
    
    /**
     *
     * @return  the last name
     */
    String getLast();

    /**
     *
     * @param last  a string containing the last name
     */
    void setLast(String last);    
}
