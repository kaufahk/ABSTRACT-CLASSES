package Staff_Members;

public class Doctor extends Medical_Staff{
    public Doctor (String employeeID, String department, int workingHours){
        super(employeeID,department,workingHours);
    }
    @Override
    public void Duty() {
        System.out.println("Doctor examines patients");
    }
}
