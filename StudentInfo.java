package StudentInfo;

import java.util.Scanner;

public class StudentInfo
{
    public static void main(String[] args) 
    {
        Student stud = new Student();
        
        Scanner num = new Scanner (System.in);
        
        System.out.print("Full Name: ");
        String Fname = num.nextLine();
        stud.getFname(Fname);
        
        System.out.print("Student No.: ");
        int studnum = num.nextInt();
        stud.getStudentNo(studnum);   

        System.out.print("Course: ");
        String course = num.nextLine();
        stud.getCourse(course);     

        System.out.print("Address: ");
        String address = num.nextLine();
        stud.getAdress(address);
        
        System.out.print("guardian's name: ");
        String gar = num.nextLine();
        stud.getguardian's name(guardian's name);

        System.out.print("Gender:");
        String gen = num.nextLine();
        stud.getStudGender(gen);
        
        System.out.print("Age: ");
        int age = num.nextInt();
        stud.getAge(age);
        
        System.out.print("Date of Birth: ");
        int dob = num.nextInt();
        stud.getDateofBirth(dob);
        
        System.out.print("Contact No.: ");
        int contact = num.nextInt();
        stud.getContact(contact);
    }
}
