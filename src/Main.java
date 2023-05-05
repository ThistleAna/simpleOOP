public class Main {
    public static void main(String[] args) {

        Math student1 = new Math("Harry", "Potter", 12);
        System.out.println(student1.fName + " " + student1.lName + ", age " + student1.age);
        Math student2 = new Math("Yasmin", "Ahmad", 50);
        System.out.println(student2.fName + " " + student2.lName + ", age " + student2.age);
        Math student3= new Math("Jet", "Bob", 18);
        System.out.println(student3.fName+ " "+ student3.lName+ ",age "+ student3.age);
        Math student4 = new Math("Bruce", "Lee", 250);
        System.out.println(student4.fName + " " + student4.lName + ", age " + student4.age);
        Math student5 = new Math( "Luigi", "Marcos", 8);
        System.out.println(student5.fName + " " + student5.lName + ", age " + student5.age);
    }
}
