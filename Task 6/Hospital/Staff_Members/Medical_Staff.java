package Staff_Members;

public abstract class Medical_Staff {
    String EmployeeID;
    String Department;
    int WorkingHours;

    public Medical_Staff(String employeeID, String department, int workingHours) {
        EmployeeID = employeeID;
        Department = department;
        WorkingHours = workingHours;
    }
}
