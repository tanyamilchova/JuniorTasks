package main.Collections.ArrayList;

public class DemoStudentsClassRoom {
    public static void main(String[] args) {
        CustomArrayListClassroom classroom=new CustomArrayListClassroom();
        int[]id={1,2,3};
        String[]name={"Marina","Kalina","Hary"};
        String[]subject={"Math","Literature","Biolojy"};
        classroom.addElement(id,name,subject);
        classroom.addSingleElement(4,"Ivan","IT");
        classroom.displayElement(classroom.setStudentList());
    }
}
