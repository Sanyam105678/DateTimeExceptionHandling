package com.company;

import java.util.Scanner;
class Main {
    public static void main(String args[]) throws InvalidAgeException {
        EmployeeBonus obj = new EmployeeBonus();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the joining date in yyyy-MM-dd format");
        String str = sc.next();
        try {
            double amt = obj.bonus(str);
            System.out.println("Bonus:"+amt);
        }
        catch (InvalidAgeException e){
            System.out.println("Please pass the date in correct format");
        }



    }
}



