import java.lang.invoke.SwitchPoint;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Faculty extends Person implements FacultyMethods
{
    static Scanner sc = new Scanner(System.in);
    int lastFourDigits = 1000;
    ArrayList<FacultyInfo> employees = new ArrayList<>();

    enum Curriculum
    {
        SOFTWARE, MANAGEMENT, MATHEMATICS, ELECTRONICS, LANGUAGES, SOCIALSCIENCES, LABATTENDENT;
    }

    public void addFaculty()
    {
        System.out.println("enter name: ");
        String name = sc.next().toLowerCase();

        employees.add(new FacultyInfo(name, getAge(), getGender(), getEmployeeId(), "teacher", getCurriculum()));
    }

    @Override
    public void updateFaculty(String eNumber)
    {
        for (FacultyInfo i :
                employees) {
            if (i.employeeNumber.equals(eNumber))
                System.out.println("enter  new name: ");
            i.employeeName = sc.next().toLowerCase();
            i.employeeCurriculum = getCurriculum();
            i.employeeGender = getGender();
            i.employeeAge = getAge();
            i.status = getCurriculum();

            break;

        }
    }

    @Override
    public void displayFaculty()
    {

        for (FacultyInfo i : employees)
            System.out.println(i.toString());

    }

    @Override
    public void deleteFaculty(String eNumber)
    {
        for (FacultyInfo i :
                employees) {
            if (i.employeeNumber.equals(eNumber))
                employees.remove(i);
            break;

        }
    }

    String getCurriculum()
    {
        System.out.println("select curriculum");
        int i = 1;
        for (Curriculum curriculum : Curriculum.values()) {
            System.out.println(i++ + " " + curriculum);
        }
        System.out.println("enter curriculum number:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                return "Software";
            case 2:
                return "management";
            case 3:
                return "mathematics";
            case 4:
                return "electronics";
            case 5:
                return "languages";
            case 6:
                return "socialsciences";
            case 7:
                return "labattendent";
            default:
                return null;
        }

    }

    private String getEmployeeId()
    {

        return (((LocalDate.now()).format(DateTimeFormatter.ofPattern("yyyy"))) + "-faculty-" + lastFourDigits++).toLowerCase();
    }
}
