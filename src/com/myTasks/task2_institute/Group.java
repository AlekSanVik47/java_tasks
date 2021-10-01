package com.myTasks.task2_institute;

import java.util.ArrayList;

public class Group {
    private ArrayList<Student> students = null;
    private ArrayList<Teacher> teachers = null;

    public Group() {
        students = new ArrayList <>();
        teachers = new ArrayList <>();
    }

    public void addStudent(Student student){
       students.add(student);
    }

    public void addTeacher (Teacher teacher){
        teachers.add(teacher);
        teacher.getGroups().add(this);
    }

    public ArrayList <Student> getStudents() {
        return students;
    }

    public ArrayList <Teacher>

    getTeachers() {
        return teachers;
    }
}
