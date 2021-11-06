import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

import java.util.ArrayList;

import java.util.Scanner;

public class Student extends Person implements StudentMethods

{
    Scanner sc = new Scanner(System.in);
    static int lastFourDigits = 1000;//of roll number
    ArrayList<StudentInfo> students = new ArrayList<>();

    public void updateStudent(String aridNo)
    {
        System.out.println("updating student");
        for (StudentInfo s : students)
            if (s.studentRollNumber.equals(aridNo)) {
                System.out.println("Enter student new name: ");
                s.studentAge = getAge();
                s.studentName = sc.next();
                s.studentGender = getGender();
            }
    }

    public void displayStudents()
    {
        System.out.println("ALL STUDENTS ARE ");
        for (StudentInfo i : students) {
            System.out.println(i.toString());

        }
    }

    public void addStudent()
    {

        System.out.println("Enter student name: ");
        String studentName = sc.next();

        students.add(new StudentInfo(studentName, getRollNo(), getAge(), getGender()));
    }

    public String getRollNo()

    {

        return (((LocalDate.now()).format(DateTimeFormatter.ofPattern("yyyy"))) + "-arid-" + lastFourDigits++).toLowerCase();
    }

    public void deleteStudent(String aridNo)
    {
        for (StudentInfo s : students
        ) {
            if (s.studentRollNumber.equals(aridNo)) {

                students.remove(s);
                System.out.println("name: " + s.studentName + "roll no:" + s.studentRollNumber + " removed successfully");
                break;
            }

        }
    }

    public void viewAttendence()
    {
    }

    public void viewMarkSheet()
    {
    }

    public void viewFees()
    {
    }

    public void askQuery()
    {
        String studentRollNo=this.getRollNo();
        System.out.println("to which teacher you want to send query:");
        String teacherName=sc.next().trim();
        System.out.println("Enter your query:");
        String query=sc.next().trim();
    }

}
