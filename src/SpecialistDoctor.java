import java.util.ArrayList;
import java.util.List;


public class SpecialistDoctor extends Doctor {
    private Ward ward;                                                          // Association with Ward
    private List<Patient> patientsResponsibleFor = new ArrayList<Patient>();    // Association with patient

}
