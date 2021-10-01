package com.myTasks.task2_institute;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Teacher extends Person{

    ArrayList <Group> groups;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(String name, String surname, ArrayList <Group> groups, String subject) {
        super(name, surname);
        this.groups = groups;
        this.subject = subject;
    }

    private String subject;

    @Override
    public String toString() {
        return new StringJoiner(", ", Teacher.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("surname='" + surname + "'")
                .add("groups=" + groups)
                .toString();
    }

    public ArrayList <Group> getGroups() {
        return groups;
    }
    public Teacher(String name, String surname) {
        super(name, surname);
         groups = new ArrayList <>();
    }
    public ArrayList<Student> getStudents (Group group){
        return group.getStudents();
    }

}
