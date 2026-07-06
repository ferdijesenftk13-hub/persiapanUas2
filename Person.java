/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication_oopjey;

/**
 *
 * @author jey
 */
public class Person {
    protected String idCard;
    protected String name;

    public Person(String idCard, String name) {
        this.idCard = idCard;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getIdCard() {
        return idCard;
    }
}
