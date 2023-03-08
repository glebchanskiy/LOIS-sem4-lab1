package org.example;

import org.example.exceptions.BracketsException;
import org.example.exceptions.EmptyTokenException;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Validator.inDetail = false;
        System.out.println(args[0]);
        try {
            if (Validator.validatePcnf(args[0]))
                System.out.println("It is PCNF");
            else
                System.out.println("It is NOT PCNF");

        }
        catch (BracketsException | EmptyTokenException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();


    }
}