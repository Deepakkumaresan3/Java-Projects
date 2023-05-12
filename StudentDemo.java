
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import src.StudentDoesntExist;
import src.StudentDoesntExit;

import java.util.Scanner;
public class StudentDemo {
    public static void main(String[] args) {
        int n,rollNum=0;
        StudentManagementSystem  sms = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---------------------------------->");
            System.out.println("Add Student ----> 1 ");
            System.out.println("Delete Student ----> 2");
            System.out.println("Students List ----> 3");
            System.out.println("Update Student ----> 4");
            System.out.println("Find Topper  ----> 5 ");
            System.out.println("Exit ----> 6");
            System.out.println("Enter your choice :");
            n=scanner.nextInt();

            if(n==1)
            {
                int marks[]=new int[6];
                System.out.println("Enter your name : ");
                String name= scanner.next();
                System.out.println("Enter your address : ");
                String address= scanner.next();
                System.out.println("Enter your subject :");
                String subject= scanner.next();
                System.out.println("Enter your Marks");
                for(int i=0;i<6;i++) {
                    System.out.println("Enter "+(i+1)+ " Mark :");
                    marks[i] = scanner.nextInt();
                }
                if(sms.addStudent(new Student(rollNum++,name,address,subject,marks))) {
                    System.out.println("Student Account created :");
                    System.out.println("Your RollNo :"+(rollNum));
                    System.out.println("************* Thank You ***************");
                    System.out.println();

                }
                else
                    System.out.println("Sorry Space Full :");
            } else if (n==2)
            {
                try {
                    System.out.println("Enter your RollNo");
                    long rollNo = scanner.nextLong();
                    if(sms.deleteStudent(rollNo))
                        System.out.println("Student has been deleted successfully:");

                }catch (StudentDoesntExist e) {
                    System.out.println(e);
                }
            }

            else if (n==3) {
                    sms.listStudents();
            }

            else if (n==4) {
                int marks[] = new int[6];
                System.out.println("Enter your rollNo :");
                int rn;
                rn = scanner.nextInt();
                System.out.println(" Enter your name : ");
                String name = scanner.next();
                System.out.println("Enter your address : ");
                String address = scanner.next();
                System.out.println("Enter your subject :");
                String subject = scanner.next();
                System.out.println("Enter your Marks:");
                for (int i = 0; i < 6; i++) {
                    System.out.println("Enter "+(i+1)+" Mark :");
                    marks[i] = scanner.nextInt();
                }

                try {
                    if (sms.updateStudent(rn, new Student(rn, name, address, subject, marks)))
                        System.out.println("Student has been updated :");

                } catch (StudentDoesntExist e) {
                    throw new RuntimeException(e);
                }
            }
            else if(n==5)
                System.out.println(sms.findTopper().getName());
            else if(n!=6)
                System.out.println("Invalid Input :");


        }while(n!=6);
    }
}