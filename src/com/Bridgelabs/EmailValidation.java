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
    public static void lastName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Last name: ");
        String name = sc.next();
        String regex = "^[A-Z]{1}+[a-z]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        if(matcher.matches()) {
            System.out.println("Given Name id is valid");
        } else {
            System.out.println("Given Name id is not valid");
        }
    }
    public static void emailAddress() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email name: ");
        String email = sc.next();
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("Given Email id is valid");
        } else {
            System.out.println("Given Email id is not valid");
        }
    }
    public static void phoneNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Phone No. name: ");
        String phone = sc.next();
        String regex = "^[0-9]{2}+[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        if (matcher.matches()) {
            System.out.println("Given Phone No. is valid");
        } else {
            System.out.println("Given Phone No. is not valid");
        }
    }
    public static void passwordValidation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Password : ");
        String password = sc.next();
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Given Password is valid");
        } else {
            System.out.println("Given Password is not valid");
        }
    }
    public static void main(String[] args) {
        firstName();
        lastName();
        emailAddress();
        phoneNumber();
        passwordValidation();
    }
}


