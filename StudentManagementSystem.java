import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

public class StudentManagementSystem implements StudentMgmtInterface {
  int i;
  List<Student> studentArray = new ArrayList<>(10);
    public boolean addStudent(Student s)
    {
        if(i<=10) {
            studentArray.add(s);
            i++;

            return true;
        }
        else
        return false;
    }

    @Override
    public boolean deleteStudent(long rollNo) throws  StudentDoesntExist {
       for(Student s : studentArray)
           if(s.getRollNo()==rollNo-1) {
               studentArray.remove(s);
               return true;
           }
          throw new StudentDoesntExist(rollNo + " is not found :");
           }


    @Override
    public void listStudents() {
     studentArray.stream().forEach(System.out::println);
    }

    @Override
    public boolean updateStudent(long rollNo, Student std) throws StudentDoesntExist {
        for (int i=0;i<studentArray.size();i++)
              if (studentArray.get(i).getRollNo()==rollNo) {
                  studentArray.set(i, std);
                  return true;
              }
          throw new StudentDoesntExist("Mentioned roll number is not found :");
    }

    @Override
    public Student findTopper() {
        double max=0.0,s=0.0;
        Student m = studentArray.get(0);
        for(Student j : studentArray)
            for (int i = 0; i< j.getMarks().length; i++)
            {
                double dd=Double.valueOf(s).compareTo(Double.valueOf(( Arrays.stream(j.getMarks()).average()).getAsDouble()));
                if (dd>max) {
                    max = s;
                     m=j;
                }

        }
        return m;

    }
}
