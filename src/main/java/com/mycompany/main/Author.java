/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.util.Date;

/**
 *
 * @author TTC
 */
public class Author extends Person {
    
     public Author(int id, String name, int address, Date dob) {
        super (id, name, address, dob); 
    }
     
     public String getInfo(int id, String name, int add, Date d) {
         return "ID: " + id + "Name: " + name + "Address: " + add + "Date of birth: " + d;
     }
    
}
