package ex_33_collectionFramework_comparable_vs_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab164_Comparable_Class {
    public static void main(String[] args) {
            Student stud1 = new Student(10,124,"raziqp");
        Student stud2 = new Student(109,12409,"iqp");
        Student stud3 = new Student(104,12489,"azp");

        List<Student> studentList= new ArrayList<>();
        studentList.add(stud1);
        studentList.add(stud2);
        studentList.add(stud3);
        Collections.sort(studentList);
        System.out.println(studentList);

    }
}

class Student implements Comparable<Student>{
    private int age;
    private int rollNo;
    private String name;

    Student(int age,int rollNo,String name){
        this.age=age;
        this.rollNo=rollNo;
        this.name=name;

    }
    @Override
    public String toString(){
        return "age:"+ age + " rollNo:" + rollNo + " name:"+name;
    }


//in compareTo and comparator there will exist only one compareTo method .
// and it can only have 1 or else it show already exists
    //these is ascending order age
//    @Override
//    public int compareTo(Student o) {
//        return this.age - o.age;
//    }

    //these is ascending order rollNo

//    @Override
//    public int compareTo(Student n){
//        return this.rollNo - n.rollNo;
//    }

    public int compareTo(Student e){
        return this.name.compareTo(e.name);
    }
}

