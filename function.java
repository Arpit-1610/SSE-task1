public class Student {
    private String firstName;
    private String lastName;
    Student(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName =  lastName;
    }
    public void printFullName(){
        System.out.println(firstName + " " + lastName);
    }
}

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Morgan","Freeman"),
                new Student("Brad","Pitt"),
                new Student("Kevin","Spacey")
        };
        for (Student s : students){
            s.printFullName();//
        }
    }


}
