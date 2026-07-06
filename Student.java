/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication_oopjey;

/**
 *
 * @author jey
 */
import java.util.ArrayList;

public class Student extends Person {

    private String nim;
    private String studyProgram;
    private ArrayList<KRS> krsList;

    public Student(String idCard, String name, String nim, String studyProgram) {
        super(idCard, name);
        this.nim = nim;
        this.studyProgram = studyProgram;
        this.krsList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return getName(); 
    }

    public String getNim() {
        return nim;
    }

    public String getStudyProgram() {
        return studyProgram;
    }

    public void addKRS(KRS krs) {
        krsList.add(krs);
    }
}