import java.util.ArrayList;
import java.util.List;

// Each ward belongs (has) only one hospital.
// Each ward has between 1 and 5 doctors, and they compose it.
// Each ward has many patients (but they do not compose it)
public class Ward {
    private String name;
    private int capacity;
    private int occupancy;                                          // occupancy <= capacity

    private SpecialistDoctor head;                                  // Association with SpecialistDoctor
    private List<Patient> patients = new ArrayList<Patient>();      // Association with patients
    private List<Doctor> doctors = new ArrayList<Doctor>();         // Association with doctors

    public void addDoctor(Doctor d) {
        if (doctors.size() < 5) {
            doctors.add(d);
        }
        else{
            System.out.println("Only 5 doctors are permitted");
        }
    }

    public void acceptPatient(Patient p){
        if ( occupancy < capacity ){
            patients.add(p);
            this.occupancy = patients.size();
        }
        else{
            System.out.println("Capacity reached no new patients may be admitted.");
        }
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public int getOccupancy(){
        return occupancy;
    }
}