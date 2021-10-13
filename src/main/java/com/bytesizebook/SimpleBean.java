/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bytesizebook;

import com.bytesizebook.data.DescriptionNumber;
import com.bytesizebook.data.FirstLast;
import com.bytesizebook.data.Hobby;
import com.bytesizebook.data.Name;
import com.bytesizebook.data.impl.HobbyImpl;
import com.bytesizebook.data.impl.NameImpl;
import com.bytesizebook.data.impl.User;
import com.bytesizebook.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

/**
 *
 * @author timdowney
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

@SpringBootApplication
public class SimpleBean implements CommandLineRunner {    
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SimpleBean.class, args);
    }
/* This comment section can be removed. It was needed to generate the archetype.

*/
    @Value("${program:client}")
    String program;
/* This comment section can be removed. It was needed to generate the archetype.

*/
    @Bean
    public FirstLast getFirstLast() {
        return new User();
    }
    
    @Bean("qualifier")
    public Name qualifiedName() {
        return new NameImpl("qualifier");
    }
    
    @Primary
    @Bean("primary")
    public Name primaryName() {
        return new NameImpl("primary");
    }
    
    @Bean("simple")
    public Name simpleName() {
        return new NameImpl("simple");
    }

    @Bean("hobby")
    public Hobby primaryHobby() {
        return new HobbyImpl("hobby");
    }
    
    @Bean("simple")
    public Hobby simpleHobby() {
        return new HobbyImpl("simple");
    }
    
    @Autowired
    @Qualifier("qualifier")
    Name name;

    @Autowired
    Hobby hobby;

    @Autowired
    FirstLast client;
    
    //autowire qualifier
    @Autowired
    @Qualifier("widget")
    DescriptionNumber thing;

    @Autowired
    ProductService service;

    @Override
    public void run(String... args) {
        if (program == null) {
            throw new 
               RuntimeException("'program' should have a value");
        }
        client.setFirst("Ada");
        client.setLast("Lovelace");
        thing.setDescription("Analytic Engine");
        thing.setNumber(1843L);
        if (program.equals("client")) {
            System.out.println(client.toString());
        } else if (program.equals("automobile")) {
            System.out.println(thing.toString());
        } else {
            System.out.println(service.getProduct());
        }
    }     

}

