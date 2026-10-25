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
    public void Details(){
        System.out.println("Employee ID: "+EmployeeID);
        System.out.println("Department: "+Department);
        System.out.println("Working hours: "+WorkingHours);
    }
    public abstract void Duty();
}
