package ro.ulbs.paradigme.lab4;

import java.util.ArrayList;

public class Student {
    private String name;
    private String grupa;
    private ArrayList<Integer> note;

    public Student(String name, String grupa, ArrayList<Integer> note) {
        this.name = name;
        this.grupa = grupa;
        this.note = note;
    }
    public String getName(){
        return name;
    }
    public String getGrupa(){
        return grupa;
    }
    public ArrayList<Integer> getNote(){
        return note;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGrupa(String grupa){
        this.grupa = grupa;
    }
    public void setNote(ArrayList<Integer> note){
        this.note = note;
    }



}
