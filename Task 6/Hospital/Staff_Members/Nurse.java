package Staff_Members;

public class Nurse extends Medical_Staff{
    public Nurse(String employeeID, String department, int workingHours){
        super(employeeID, department, workingHours);
    }
    @Override
    public void Duty() {
        System.out.println("Nurse takes care of patients");
    }
}
