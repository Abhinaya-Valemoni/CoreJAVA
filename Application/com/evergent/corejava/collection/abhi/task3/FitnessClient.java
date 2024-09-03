package com.evergent.corejava.collection.abhi.task3;

import java.util.Scanner;

public class FitnessClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FitnessInterface fitnessManager = new FitnessImp();
        
        while (true) {
            System.out.println("1. Add Member 2. Search by Member ID 3. Display All Members 4. Calculate Total Cost 5. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the member ID:");
                    String memberId = sc.next();
                    System.out.println("Enter the member's name:");
                    String name = sc.next();
                    System.out.println("Enter the member's age:");
                    int age = sc.nextInt();
                    System.out.println("Enter the fitness plan cost:");
                    double planCost = sc.nextDouble();
                    Member member = new Member(memberId, name, age, planCost);
                    String message = fitnessManager.addMember(member);
                    System.out.println("Member added with ID: " + message);
                    break;
                case 2:
                    System.out.println("Enter the member ID to search:");
                    String searchId = sc.next();
                    fitnessManager.searchById(searchId);
                    break;
                case 3:
                    fitnessManager.displayAllMembers();
                    break;
                case 4:
                    double totalCost = fitnessManager.calculateTotalCost();
                    System.out.println("Total cost of all fitness plans: $" + totalCost);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

