package main.Collections.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomArrayListClassroom {
    public int size=3;
    class Student{
        int id;
        String name;
        String subject;

        Student(int id,String name,String subject){
            this.id=id;
            this.name=name;
            this.subject=subject;
        }
    }
    List<Student>students=new ArrayList<>();
    public void addElement(int[] id,String[] name,String[] subject){

        for (int i = 0; i < size; i++) {
            students.add(new Student(id[i],name[i],subject[i]));
        }
//        displayElement(students);
    }
    public void addSingleElement(int id,String name,String subject){
        students.add(new Student(id,name,subject));
    }

    public void displayElement(List<Student>students){
        System.out.println("StudentId "+"StudentName "+"Subject");
        System.out.println("------------------------------------");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).id+"      "+students.get(i).name+"         "+students.get(i).subject);
        }
    }
    public List<Student> setStudentList(){
        List<Student>studentList= Collections.unmodifiableList(students);
        return studentList;
    }


}
