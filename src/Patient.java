// Each patient has only one ward
public class Patient {
    private String gender;      // TODO: check for better implementation for gender
    private String name;
    private String accepted;    // TODO: represents a date - check if there's build in implementation for date.

    private Ward ward;          // Derived from association

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccepted() {
        return accepted;
    }

    public void setAccepted(String accepted) {
        this.accepted = accepted;
    }

    public Ward getWard() {
        return ward;
    }

    public void setWard(Ward ward) {
        this.ward = ward;
    }
}
