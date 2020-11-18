package test;

public class Students {
    private String studentid;
    private String studentname;
    private String studentaddress;
    private String studentphone;

    public Students(String studentid, String studentname, String studentaddress, String studentphone) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.studentaddress = studentaddress;
        this.studentphone = studentphone;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentaddress() {
        return studentaddress;
    }

    public void setStudentaddress(String student_address) {
        this.studentaddress = studentaddress;
    }

    public String getStudentphone() {
        return studentphone;
    }

    public void setStudentphone(String studentphone) {
        this.studentphone = studentphone;
    }

    public String toString() {
        return "Students{" +
                "StudentID =" + studentid +
                ", StudentName='" + studentname + '\'' +
                ", StudentAddress='" + studentaddress + '\'' +
                ", StudentPhone='" + studentphone + '\'' +
                '}';
    }
}