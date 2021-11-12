package com.amel.pbo.modul5.percobaan;

public class Classroom {
    private int classCode;
    private  String className;
    private  Student student;

    public Classroom(int classCode, String className){
        this.classCode = classCode;
        this.className = className;
    }

    public void setStudent(Student student){
        this.student = student;
    }

    public int getClassCode(){
        return classCode;
    }

    public String getClassName(){
        return className;
    }

    public String getStudentName(){
        return student.getName();
    }
}
