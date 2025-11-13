package OOPS;

//Many forms
//Two types:compile( method overloading) and runtime (method overriding)
class Employee {
public void work(){
    System.out.println("Works as an employee");
}   
}
class Manager extends Employee{
    public void work(){
    System.out.println("Works as Manager which manage projects");
}    
}
class Developer extends Employee{
public void work(){
    System.out.println("Works as Developer which develop projects");
}
}
class Tester extends Employee{
public void work(){
    System.out.println("Works as Tester which test projects");
}
    
}

public class Polymorphism {
    public static void main(String[] args) {
     //Polymorphism :where object reference is poining to child object
     //Employee object refernce  point to Manager,Tester,Developer 

     Employee m = new Manager();
     m.work();
     Employee d = new Developer();
     d.work();
     Employee t = new Tester();
       t.work();

    }
}
