package com.myTasks.task2_institute;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Student extends Person{
    private Group group;

    public Student(String name, String surname, Teacher teacher) {
        super(name, surname);
    }
    public void addToGroup (Group group){
        group.addStudent(this);
    }

    public boolean choiceTeacher (Teacher teacher) {
        ArrayList<Group> groups = teacher.getGroups();
        if (groups.isEmpty()){
            return false;
        }
        int minSize = groups.get(0).getStudents().size(),pos = 0;
        int counter = 0;
        for (Group group: groups){
            if (group.getStudents().size()< minSize){
                minSize = group.getStudents().size();
                pos = counter;
            }
            counter++;
        }
        groups.get(pos).addStudent(this);
        return true;
    }

    public ArrayList<Teacher> getTeacher(){
        return group == null ? null: group.getTeachers();
    }
    public ArrayList<Student> getSameGroupMembers (){
        if (group == null){
            return null;
        }
        ArrayList<Student> students = group.getStudents();
        students.remove(this);
        return students;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("surname='" + surname + "'")
                .add("group=" + group)
                .toString();
    }
}
