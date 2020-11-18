package test;

public class Students {
    private String student_ID;
    private String student_Name;
    private String student_Address;
    private String student_Phone;

    public Students(String student_ID, String student_Name, String student_Address, String student_Phone) {
        this.student_ID = student_ID;
        this.student_Name = student_Name;
        this.student_Address = student_Address;
        this.student_Phone = student_Phone;
    }

    public String getStudent_ID() {
        return student_ID;
    }

    public void setStudent_ID(String student_ID) {
        this.student_ID = student_ID;
    }

    public String getStudent_Name() {
        return student_Name;
    }

    public void setStudent_Name(String student_Name) {
        this.student_Name = student_Name;
    }

    public String getStudent_Address() {
        return student_Address;
    }

    public void setStudent_Address(String student_Address) {
        this.student_Address = student_Address;
    }

    public String getStudent_Phone() {
        return student_Phone;
    }

    public void setStudent_Phone(String student_Phone) {
        this.student_Phone = student_Phone;
    }

    @Override
    public String toString() {
        return "Students{" +
                "student_ID=" + student_ID +
                ", student_Name='" + student_Name + '\'' +
                ", student_Address='" + student_Address + '\'' +
                ", student_Phone='" + student_Phone + '\'' +
                '}';
    }
}