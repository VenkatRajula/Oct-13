/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bytesizebook.service.impl;

import com.bytesizebook.data.DescriptionNumber;
import com.bytesizebook.data.FirstLast;
import com.bytesizebook.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * A class for a new car that implements ProductService.
 * It contains two other references to additional interfaces.
 * 
 * @author timdowney
 */
@Service
public class NewCarOwner implements ProductService {
    
    FirstLast person;
    DescriptionNumber thing;
    
    /**
     * An accessor for the product
     * 
     * @param thing
     */
    @Autowired 
    @Qualifier("widget")
    public void setThing(DescriptionNumber thing) {
        this.thing = thing;
    }
    
    //construct NewCarOwner

    /**
     * A constructor containing a person.
     * 
     * @param person
     */
    @Autowired 
    public NewCarOwner(FirstLast person) {
        this.person = person;
    }

    /**
     * Accessor for the product
     * 
     * @return  a string representation of the product containing the object 
     * and the person.
     */
    @Override
    public String getProduct() {
        return String.format("(NewCarOwner) %s; %s", 
            person.toString(),
            thing.toString());
    }

    /**
     * An accessor for the person 
     * 
     * @return  the person associated with the product
     */
    public FirstLast getPerson() {
        return person;
    }

    /**
     * Mutator for person
     * @param person
     */
    public void setPerson(FirstLast person) {
        this.person = person;
    }

    /**
     * An accessor for the object associated with the product
     * @return
     */
    public DescriptionNumber getThing() {
        return thing;
    }    
    
}
