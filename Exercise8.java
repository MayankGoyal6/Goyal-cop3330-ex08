/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 8
 *  Copyright 2021 Mayank Goyal
 */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   
  Scanner scanner = new Scanner(System.in);

  System.out.println("How many people? ");
  int people = scanner.nextInt();

  System.out.println("How many pizzas do you have? ");
  int pizzas = scanner.nextInt();

  System.out.println("How many slices per pizza? ");
  int slices = scanner.nextInt();

  int total = pizzas*slices;
  int each = total/people;
  int leftover = total%people;

  System.out.println(people + " people with "+ pizzas +" pizzas ("+ total + " " + "slices)");
  System.out.println("Each person gets "+ each +" pieces of pizza.");
  System.out.println("There are "+ leftover +" leftover pieces.");

  }
}