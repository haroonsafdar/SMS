import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static Student student = new Student();//data of students associated with this object
    public static Faculty faculty = new Faculty();
    static Scanner sc = new Scanner(System.in);

    static void mainMenu()
    {

        System.out.println("1-admin mode");
        System.out.println("2-faculty mode");
        System.out.println("3-student mode");

        try {
            int choice = sc.nextInt();
            if (choice == 1)
                adminMenu();
            else if (choice == 2)
                facultyMenu();
            else if (choice == 3)
                studentMenu();
        } catch (Exception e) {
            mainMenu();
        }

    }

    private static void adminMenu()
    {

        System.out.println("1-Add/update/delete/View students.");
        System.out.println("2-add/update/delete/view faculty.");

        System.out.println("3-View/update/delete Attendance  of the students.");
        System.out.println("4-Add/update/delete/View Fees of the students.");
        System.out.println("5-Add/update/delete/View Subject of the students.");
        System.out.println("6-promote faculty to admin");

        int choice = sc.nextInt();

        if (choice == 1) {
            int choice1;

            do {
                System.out.println("1.add student\n" +
                        "2.update student\n" +
                        "3.delete student\n" +
                        "4.view students\n" +
                        "0-exit");
                choice1 = sc.nextInt();
                if (choice1 == 0)
                    adminMenu();
                if (choice1 == 1)
                    student.addStudent();
                else if (choice1 == 2) {

                    student.updateStudent(getAridNo());
                } else if (choice1 == 3) {

                    student.deleteStudent(getAridNo());
                } else if (choice1 == 4)
                    student.displayStudents();

            } while (true);
        } else if (choice == 2) {
            int choice1;

            do {
                System.out.println("1.add faculty\n" +
                        "2.update faculty\n" +
                        "3.delete faculty\n" +
                        "4.view faculty\n" +
                        "0-exit");
                choice1 = sc.nextInt();
                if (choice1 == 0)
                    adminMenu();
                if (choice1 == 1)
                    faculty.addFaculty();
                else if (choice1 == 2) {

                    faculty.updateFaculty(getEmployeeNo());
                } else if (choice1 == 3) {

                    faculty.deleteFaculty(getEmployeeNo());
                } else if (choice1 == 4)
                    faculty.displayFaculty();

            } while (true);
        }
    }

    private static String getEmployeeNo()
    {
        System.out.println("enter employee number:");
        return sc.next().toLowerCase();
    }

    private static void facultyMenu()
    {

        System.out.println("1-Add/update/delete/View Attendance  of teachers/students.");
        System.out.println("2-Add/update/delete/View Subject of the teachers/students.");
        System.out.println("3-Add/update/delete/View Mark Sheet of the students.");

    }

    private static void studentMenu()
    {

        System.out.println("1-view attendance.");
        System.out.println("2-view the mark sheet.");
        System.out.println("3-view fees.");
        System.out.println("4-ask query to teacher.");
        int choice = sc.nextInt();
        if (choice == 1)
            student.viewAttendence();
        else if (choice == 2)
            student.viewMarkSheet();
        else if (choice == 3)
            student.viewFees();
        else if (choice == 4)
            student.askQuery();
        else {
            System.out.println("invalid choice");
            studentMenu();
        }

    }

    static String getAridNo()
    {
        System.out.println("ENTER STUDENT'S ARID NUMBER:");
        return sc.next().trim().toLowerCase();
    }

    public static void main(String[] args)
    {

        mainMenu();
    }
}
