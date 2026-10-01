import java.util.*;
class Student implements Comparable<Student> {
    String name;
    int rollno;
    int marks;
    Student(String name,int rollno,int marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }
    public int compareTo(Student s){
        return this.marks-s.marks; //ascending order
}
    public String toString(){
        return this.name+" "+this.rollno+" "+this.marks;
    }
}
class CustomComparator implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        if(s1.marks != s2.marks){
            return s2.marks-s1.marks; 
        }
        return s1.rollno-s2.rollno;
}}
public class Comparabledemo{
    public static void main(String[] args) {
        List<Student> l = new ArrayList<>();
        l.add(new Student("A",1,90));
        l.add(new Student("B",2,80));
        l.add(new Student("C",3,70));
        l.add(new Student("D",4,60));
        l.sort(null);
        System.out.println(l);
        l.sort(new CustomComparator());
        System.out.println(l);
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.sort(null); //sorts in ascending order
        System.out.println(l1);
        l1.sort(Collections.reverseOrder()); //sorts in descending order
        System.out.println(l1);
    }
}