package Lab1;
 class Student {

     String name,city;
     int age;
     void PrintData(){
       System.out.println("Name = "+name) ;
       System.out.println("City = "+city);
       System.out.println("Age= "+age);

     }
 }


public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="Liza";
        s1.city="Rangpur";
        s1.age=21;
        Student s2=new Student();
        s2.name="Udoy";
        s2.age=19;
    }
}
