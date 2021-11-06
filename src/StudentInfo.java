public class StudentInfo extends Person
{
    String studentName;
    String studentRollNumber;
    int studentAge;
    char studentGender;

    public StudentInfo(String name, String rollNo, int age, char gender)
    {
        this.status="student";
        this.studentName = name;
        this.studentAge = age;
        this.studentRollNumber = rollNo;
        this.studentGender = gender;
    }

    public StudentInfo(String studentName, int age, char gender)
    {
        this.studentName = studentName;
        this.studentAge = age;
        this.studentGender = gender;
    }

    public String toString()
    {
        return "Name: " + studentName + " Age: " + studentAge + " RollNo: " + studentRollNumber + " Gender: " + studentGender;
    }
}
