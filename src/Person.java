import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Person
{
    static Scanner sc = new Scanner(System.in);
    String status;

    char getGender()
    {
        System.out.print("Enter Gender(M/F): ");
        char gender = sc.next().toLowerCase().charAt(0);
        System.out.println();
        if (gender == 'm' || gender == 'f')
            return gender;

        System.out.print("INVALID GENDER ENTER AGAIN: ");
        return getGender();

    }

    static int getAge()
    {

        System.out.println("enter year of birth");
        int birthYear = sc.nextInt();
        System.out.println("enter month of birth");

        int birthMonth = sc.nextInt();
        System.out.println("enter day of birth");
        int birthDay = sc.nextInt();

        return Period.between(LocalDate.now(), LocalDate.of(birthYear, birthMonth, birthDay)).getYears();//int value
    }
}
