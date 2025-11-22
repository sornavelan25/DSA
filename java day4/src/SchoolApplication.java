import java.util.Scanner;

class Person {
    String name;
    String dateOfBirth;

    Person(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
    }
}

class Teacher extends Person {
    double salary;
    String subject;

    Teacher(String name, String dateOfBirth, double salary, String subject) {
        super(name, dateOfBirth);
        this.salary = salary;
        this.subject = subject;
    }

    void displayTeacherInfo() {
        System.out.println("\n--- Teacher Details ---");
        displayInfo();
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}

class Student extends Person {
    String studentId;

    Student(String name, String dateOfBirth, String studentId) {
        super(name, dateOfBirth);
        this.studentId = studentId;
    }

    void displayStudentInfo() {
        System.out.println("\n--- Student Details ---");
        displayInfo();
        System.out.println("Student ID: " + studentId);
    }
}

class CollegeStudent extends Student {
    String collegeName;
    String yearOfStudy;

    CollegeStudent(String name, String dateOfBirth, String studentId, String collegeName, String yearOfStudy) {
        super(name, dateOfBirth, studentId);
        this.collegeName = collegeName;
        this.yearOfStudy = yearOfStudy;
    }

    void displayCollegeStudentInfo() {
        System.out.println("\n--- College Student Details ---");
        displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("College Name: " + collegeName);
        System.out.println("Year of Study: " + yearOfStudy);
    }
}

public class SchoolApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Enter Person Details ---");
        System.out.print("Enter Name: ");
        String pname = sc.nextLine();
        System.out.print("Enter Date of Birth: ");
        String pdob = sc.nextLine();
        Person p = new Person(pname, pdob);
        p.displayInfo();

        System.out.println("\n--- Enter Teacher Details ---");
        System.out.print("Enter Name: ");
        String tname = sc.nextLine();
        System.out.print("Enter Date of Birth: ");
        String tdob = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();
        Teacher t = new Teacher(tname, tdob, salary, subject);
        t.displayTeacherInfo();

        System.out.println("\n--- Enter Student Details ---");
        System.out.print("Enter Name: ");
        String sname = sc.nextLine();
        System.out.print("Enter Date of Birth: ");
        String sdob = sc.nextLine();
        System.out.print("Enter Student ID: ");
        String sid = sc.nextLine();
        Student s = new Student(sname, sdob, sid);
        s.displayStudentInfo();

        System.out.println("\n--- Enter College Student Details ---");
        System.out.print("Enter Name: ");
        String csname = sc.nextLine();
        System.out.print("Enter Date of Birth: ");
        String csdob = sc.nextLine();
        System.out.print("Enter Student ID: ");
        String csid = sc.nextLine();
        System.out.print("Enter College Name: ");
        String collegeName = sc.nextLine();
        System.out.print("Enter Year of Study: ");
        String year = sc.nextLine();
        CollegeStudent cs = new CollegeStudent(csname, csdob, csid, collegeName, year);
        cs.displayCollegeStudentInfo();

        sc.close();
    }
}


