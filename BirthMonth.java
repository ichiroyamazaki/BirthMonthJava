package com.mycompany.birthmonth;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

public class BirthMonth {

    public static void main(String[] args) {
        Set group1 = new HashSet();
        Set group2 = new HashSet();
        Set self = new HashSet();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter birth month " + (i + 1) + ": ");
            String scan = sc.nextLine();
            group1.add(scan);
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter birth month " + (i + 1) + ": ");
            String scan2 = sc.nextLine();
            group2.add(scan2);
        }

        StringBuilder sb1 = new StringBuilder();
        sb1.append("Group 1: {");
        for (Object month : group1) {
            sb1.append("'").append(month).append("', ");
        }
        System.out.println(sb1.substring(0, sb1.length() - 2) + "}");

        StringBuilder sb2 = new StringBuilder();
        sb2.append("Group 2: {");
        for (Object month : group2) {
            sb2.append("'").append(month).append("', ");
        }
        System.out.println(sb2.substring(0, sb2.length() - 2) + "}");

        System.out.print("Enter your birth month: ");
        String scan3 = sc.nextLine();

        self.add(scan3);

        Set union = new HashSet(group1);
        Set inter = new HashSet(group1);
        Set diff = new HashSet(group1);

        union.addAll(group2);
        inter.retainAll(group2);
        diff.removeAll(group2);

        StringBuilder sb3 = new StringBuilder();
        sb3.append("Union: {");
        for (Object month : union) {
            sb3.append("'").append(month).append("', ");
        }
        System.out.println(sb3.substring(0, sb3.length() - 2) + "}");

        StringBuilder sb4 = new StringBuilder();
        sb4.append("Intersection: {");
        for (Object month : inter) {
            sb4.append("'").append(month).append("', ");
        }
        System.out.println(sb4.substring(0, sb4.length() - 2) + "}");

        StringBuilder sb5 = new StringBuilder();
        sb5.append("Difference: {");
        for (Object month : diff) {
            sb5.append("'").append(month).append("', ");
        }
        System.out.println(sb5.substring(0, sb5.length() - 2) + "}");

        if (union.containsAll(self)) {
            System.out.println("You have the same birth month with one of your classmates.");
        } else {
            System.out.println("You don't have the same birth month with one of your classmates.");
        }

    }
}
