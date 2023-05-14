import java.util.Arrays;

public class Student {
    private long rollNo;

    public Student(long rollNo, String name, String address, String subject, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.subject = subject;
        this.marks = marks;
    }

    public long getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getSubject() {
        return subject;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setRollNo(long rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    private String name;
    private String address;
    private String subject;
    private int marks[]= new int[6];

    @Override
    public String toString() {
        return
                "RollNo = " + (rollNo+1)+"\t"+
                "Name = " + name + "\t" +
                "Address = " + address + "\t" +
                "Subject = " + subject + "\t" +
                "Marks = " + Arrays.toString(marks);
    }
}
