public class AdminInfo extends Person
{
    String employeeId;
    String adminName;
    String adminPassword;
    int age;

    public AdminInfo(String eId, String aName, String aPassword, int age, String status)
    {
        this.adminName = aName;
        this.employeeId = eId;
        this.adminPassword = aPassword;
        this.age = age;
        this.status = status;
    }

}
