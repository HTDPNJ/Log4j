class Person {
    String name = "No name";

}
class Employee extends Person {
    String empID = "0000";

}
public class Main {
    public static void main(String args[]) {
        Employee e = new Employee();
        System.out.println(e.empID);
    }
}