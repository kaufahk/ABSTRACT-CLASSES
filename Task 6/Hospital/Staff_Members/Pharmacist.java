package Staff_Members;

public class Pharmacist extends Medical_Staff{
    public Pharmacist(String employeeID, String department, int workingHours){
        super(employeeID, department, workingHours);
    }
    @Override
    public void Duty() {
        System.out.println("Sells medicine");
    }
}
