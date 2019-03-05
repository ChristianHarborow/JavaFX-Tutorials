package Week20;

public class Student {
    private String studentNumber;
    private String name;
    private String address;
    private String course;

    public Student(String studentNumber, String name, String address) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.address = address;
        this.course = "n/a";
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCourse() {
        return course;
    }
}
