package StudentManagment;

import java.util.Scanner;

public class Student {
    private String firstname;
    private String lastname;
    private int gradeYear;
    private String studentId;
    private String courses;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Constructor: prompt user to enter student's name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");

        this.firstname = in.nextLine();
        System.out.print("Enter student last name: ");

        this.lastname = in.nextLine();
        System.out.print("1. Freshmen\n2. for sophmore\n3. Junior\n4. Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();

        setStudentID();
        System.out.println(firstname+ " "+lastname+ " "+ gradeYear + " " + studentId);


    }

    //Generate an ID
    private void setStudentID(){
        //Grade level + ID
        id++;
        this.studentId = gradeYear + "" +id;
    }

    //Enroll in courses
    public void enroll(){
        //Get inside a loop, user hits 0
        do{
            System.out.println("Enter course to enroll (Q to quite): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if(!course.equals("Q")){
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                break;
            }
        }while (1!=0);
        System.out.println("Enrolled In : "+courses);

    }

    //View balance
    public void viewBalance(){
        System.out.println("Your balance is : $"+tuitionBalance);
    }

    //pay tuition fee
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $"+payment);
        viewBalance();
    }

    //Show status
    public String toString(){
        return "Name: " + firstname+" "+lastname+ "\nGrade Level: "+gradeYear+ "\nCourses Enrolled: "+courses+"\nBalance: $"+tuitionBalance;
    }
}
