package practice_9._2;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    public int iDNumber;
    public int GPA;


    public Student(int n){
        this.GPA = n;
    }


    @Override
    public int compareTo(Student o) {
        return this.GPA - o.GPA;
    }
}
