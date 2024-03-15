package oopactivity_1;

import java.util.Scanner;

public class Zantua_OOPActivity_1 {

    public static void main(String[] args) {
        java.util.Scanner data = new Scanner (System.in);
        
        String firstName;
        String middleInitial;
        String lastName;
        String gender;
        int age;
        int month;
        int day;
        int year;
      
        
        
        System.out.println("First Name: ");
        firstName = data.nextLine();
        
        System.out.println("Middle Initial: ");
        middleInitial = data.nextLine();
        
        System.out.println("Last Name: ");
        lastName = data.nextLine();

        System.out.println("Gender: ");
        gender = data.nextLine();
        
        System.out.println("Age: ");
        age = data.nextInt();
        
        System.out.println("Month:");
        month = data.nextInt();         
        
        System.out.println("Day: ");
        day = data.nextInt();
        
        System.out.println("Year: ");
        year = data.nextInt();
        
        
        System.out.println("\n" + "Name: " + firstName + " "+ middleInitial + " " + 
                 lastName + "\n" + "Gender: " + gender + "\n" + "Age: " 
                + age + "\n" + "Birthdate: " 
        + month + "/" + day + "/" + year);
    }
    
}
