package ex_33_collectionFramework_comparable_vs_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab165_Comparator {
    public static void main(String[] args) {
        Student1 stud1 = new Student1(10,124,"raziqp");
        Student1 stud2 = new Student1(109,12409,"iqp");
        Student1 stud3 = new Student1(104,12489,"azp");

        List<Student1> studentList= new ArrayList<>();
        studentList.add(stud1);
        studentList.add(stud2);
        studentList.add(stud3);
        //Collections.sort(studentList, new ageComparator());
        Collections.sort(studentList, new rollnoComparator());
        //Collections.sort(studentList, new nameComparator());
        System.out.println(studentList);
    }
}


class ageComparator implements Comparator<Student1> {
    @Override
    public int compare(Student1 s1, Student1 s2){
        return s1.getAge() - s2.getAge();
    }
}

class rollnoComparator implements Comparator<Student1>{

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.getRollNo()-o2.getRollNo();
    }
}

class nameComparator implements Comparator<Student1>{

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class Student1{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int rollNo;
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    Student1(int age, int rollNo, String name) {
        this.age = age;
        this.rollNo = rollNo;
        this.name = name;

    }

    @Override
    public String toString() {
        return "age:" + age + " rollNo:" + rollNo + " name:" + name;
    }
}