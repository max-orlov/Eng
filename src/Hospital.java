import java.util.ArrayList;
import java.util.List;

// Each hospital has several wards, and they compose it.
public class Hospital {
    private String name;
    private String address;          // TODO: find if theres some builtin address attribute in java
    private String phone;           // TODO: the same with phone number
    private List<Ward> wards = new ArrayList<Ward>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
