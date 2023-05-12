import src.StudentDoesntExist;
import src.StudentDoesntExit;

public interface StudentMgmtInterface {
   boolean addStudent(Student s);
   boolean deleteStudent(long rollNo) throws StudentDoesntExit, StudentDoesntExist;
   void listStudents();
   boolean updateStudent(long rollNo, Student std) throws StudentDoesntExist;
   Student findTopper();

}
