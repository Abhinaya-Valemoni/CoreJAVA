package com.evergent.corejava.casestudyQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class SupportTicketSystem {
	Deque<String> ticketQueue=new ArrayDeque<>();
	
	// Method to add a ticket to the queue
    public void addTicket(String ticket) {
        ticketQueue.add(ticket);
        System.out.println("Ticket added: " + ticket);
    }
    
    // Method to process the next ticket in the queue
    public void processNextTicket() {
        if (!ticketQueue.isEmpty()) {
            String ticket = ticketQueue.poll();  // Remove and return the head of the queue
            System.out.println("Processing ticket: " + ticket);
        } else {
            System.out.println("No tickets to process.");
        }
    }
    
    // Method to peek at the next ticket in the queue without removing it
    public void peekNextTicket() {
        if (!ticketQueue.isEmpty()) {
            String ticket = ticketQueue.peek();  // Retrieve the head of the queue without removing
            System.out.println("Next ticket in queue: " + ticket);
        } else {
            System.out.println("No tickets in queue.");
        }
    }

    // Method to display all tickets currently in the queue
    public void displayQueue() {
        if (!ticketQueue.isEmpty()) {
            System.out.println("Current tickets in queue:");
            for (String ticket : ticketQueue) {
                System.out.println(ticket);
            }
        } else {
            System.out.println("No tickets in queue.");
        }
    }
    public static void main(String[] args) {
        SupportTicketSystem supportTicketSystem = new SupportTicketSystem();

        // Simulate adding tickets
        supportTicketSystem.addTicket("Ticket 1: Unable to login.");
        supportTicketSystem.addTicket("Ticket 2: Payment issue.");
        supportTicketSystem.addTicket("Ticket 3: Bug in the mobile app.");

        // Display the current queue
        supportTicketSystem.displayQueue();

        // Peek at the next ticket
        supportTicketSystem.peekNextTicket();

        // Process tickets in FIFO order
        supportTicketSystem.processNextTicket();
        supportTicketSystem.processNextTicket();

        // Display the queue after processing some tickets
        supportTicketSystem.displayQueue();

        // Attempt to process more tickets than available to handle empty queue case
        supportTicketSystem.processNextTicket();
        supportTicketSystem.processNextTicket();  // This should handle an empty queue gracefully
    }


}
