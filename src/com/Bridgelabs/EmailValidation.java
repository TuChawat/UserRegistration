package com.Bridgelabs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

    public static void firstName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First name: ");
        String name = sc.next();
        String regex = "^[A-Z]{1}+[a-z]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) {
            System.out.println("Given Name id is valid");
        } else {
            System.out.println("Given Name id is not valid");
        }
    }
    public static void main(String[] args) {
        firstName();
    }
}


