import Staff_Members.*;
public class Main {
    public static void main(String[] args) {
        Medical_Staff obj1 = new Doctor("B001","Surgeries",5);
        Medical_Staff obj2 = new Nurse("H001","Emergency",9);
        Medical_Staff obj3 = new Lab_technician("K078", "Laboratory",10);
        Medical_Staff obj4 = new Pharmacist("P51","Pharmacy",12);
        obj1.Details();
        obj1.Duty();
        System.out.println();
        obj2.Details();
        obj2.Duty();
        System.out.println();
        obj3.Details();
        obj3.Duty();
        System.out.println();
        obj4.Details();
        obj4.Duty();
    }
}
