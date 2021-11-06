import java.time.LocalDate;

class FacultyInfo extends Person
{
    String employeeName;
    int employeeAge;
    char employeeGender;
    String employeeNumber;
    String employeeCurriculum;
    LocalDate dob;

    public FacultyInfo(String name, int age, char gender, String eNumber, String status, String curriculum)
    {
        this.employeeAge = age;
        this.employeeName = name;
        this.employeeGender = gender;
        this.employeeNumber = eNumber;
        this.status = status;
        this.employeeCurriculum = curriculum;
    }

    public String toString()
    {
        return "Name: " + employeeName + " Age: " + employeeAge +
                " EmployeeNo: " + employeeNumber + " Gender: " + employeeGender + " Status:" + status + " curriculum:" + employeeCurriculum;
    }
}
