package day8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class CsvFileRead {
    public Student[] sortOnStudentLastName()  {
        String readLine = "";
        Student[] studentList=new Student[10];
        try {
            int index=0;
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ProTech\\Desktop\\java\\Student\\src\\day8\\datatenstudent.csv"));
            while ((readLine = br.readLine()) != null) {
                String[] studentDetails = readLine.split(",");
                Student student=new Student();
                student.setFirstName(studentDetails[0]);
                student.setLastName(studentDetails[1]);
                student.setGPA(studentDetails[2]);
                studentList[index++]=student;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Arrays.sort(studentList);
        return studentList;
    }
    public class Student implements Comparable<Student> {

        private String firstName;
        private String lastName;
        private String GPA;

        public Student() {
        }

        public Student(String firstName, String lastName, String GPA) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.GPA = GPA;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getGPA() {
            return GPA;
        }

        public void setGPA(String GPA) {
            this.GPA = GPA;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", GPA='" + GPA + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Student student) {
            return this.lastName.compareTo(student.getLastName());
        }
    }
    public static void main (String[] args){
        CsvFileRead csvFileRead=new CsvFileRead();
        Student[] studentList=csvFileRead.sortOnStudentLastName();
        for (Student student:studentList){
            System.out.println("FistName : "+student.getFirstName()+", LastName : "+student.getLastName()+", GPA : "+ student.getGPA());
        }
    }
}



