// Base class Doctor
class Doctor {
    public void diagnose() {
        System.out.println("Doctor is diagnosing a patient.");
    }
}

// Multilevel inheritance: Surgeon inherits from Doctor
class Surgeon extends Doctor {
    public void performSurgery() {
        System.out.println("Surgeon is performing surgery.");
    }
}

// Hierarchical inheritance: Nurse inherits from Doctor
class Nurse extends Doctor {
    public void assistSurgery() {
        System.out.println("Nurse is assisting in the surgery.");
    }
}

// Main class to test both multilevel and hierarchical inheritance
public class MedicalTeam {
    public static void main(String[] args) {
        // Creating objects of Doctor, Surgeon, and Nurse
        Doctor doctor = new Doctor();
        Surgeon surgeon = new Surgeon();
        Nurse nurse = new Nurse();

        // Testing method overriding and inheritance

        // Doctor method
        doctor.diagnose();

        // Surgeon methods (from Doctor + own method)
        surgeon.diagnose(); // Inherited from Doctor
        surgeon.performSurgery(); // Specific to Surgeon

        // Nurse methods (from Doctor + own method)
        nurse.diagnose(); // Inherited from Doctor
        nurse.assistSurgery(); // Specific to Nurse
    }
}
