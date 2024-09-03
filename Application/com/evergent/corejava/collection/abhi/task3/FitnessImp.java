package com.evergent.corejava.collection.abhi.task3;


import java.util.HashSet;
import java.util.Set;

public class FitnessImp implements FitnessInterface {
    private Set<Member> memberSet;

    public FitnessImp() {
        memberSet = new HashSet<>();
    }

    @Override
    public String addMember(Member member) {
        memberSet.add(member);
        return member.getMemberId();
    }

    @Override
    public void searchById(String memberId) {
        boolean found = false;
        for (Member member : memberSet) {
            if (member.getMemberId().equals(memberId)) {
                System.out.println(member);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The member with ID " + memberId + " is not found.");
        }
    }

    @Override
    public void displayAllMembers() {
        if (!memberSet.isEmpty()) {
            for (Member member : memberSet) {
                System.out.println(member);
            }
        } else {
            System.out.println("No members are available.");
        }
    }

    @Override
    public double calculateTotalCost() {
        double totalCost = 0;
        for (Member member : memberSet) {
            totalCost += member.getPlanCost();
        }
        return totalCost;
    }
}

