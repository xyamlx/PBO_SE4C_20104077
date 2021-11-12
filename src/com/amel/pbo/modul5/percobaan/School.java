package com.amel.pbo.modul5.percobaan;

public class School {
    public static void main(String[] args) {
        //Classroom constructors
        Classroom classA = new Classroom(101, "Class 101");
        Classroom classB = new Classroom(102, "Class 102");
        Classroom classC = new Classroom(103, "Class 103");

        //Student constructors
        Student stdA = new Student();
        Student stdB = new Student("Pyra");
        Student stdC = new Student(101010,"Hythra");

        //Assign students to classrooms
        classA.setStudent(stdA);
        classB.setStudent(stdB);
        classC.setStudent(stdC);

        //Output class A
        System.out.println(classA.getClassName());
        System.out.println("Class code: " + classA.getClassCode());
        System.out.println("Student   : " + classA.getStudentName());
        System.out.println();

        //Output class B
        System.out.println(classB.getClassName());
        System.out.println("Class code: " + classB.getClassCode());
        System.out.println("Student   : " + classB.getStudentName());
        System.out.println();

        //Output class C
        System.out.println(classC.getClassName());
        System.out.println("Class code: " + classC.getClassCode());
        System.out.println("Student   : " + classC.getStudentName());
    }
}
