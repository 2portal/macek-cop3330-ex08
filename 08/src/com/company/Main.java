package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.print("How many people? \n");
        Scanner peopleinput = new Scanner (System.in);
        String People = peopleinput.next();
        int guests = Integer.parseInt(People);

        System.out.print("How many pizzas do you have? \n");
        Scanner pizzainput = new Scanner (System.in);
        String Pizzas = pizzainput.next();
        int totalPizza = Integer.parseInt(Pizzas);

        System.out.print("How many slices per pizza? \n");
        Scanner Sliceinput = new Scanner (System.in);
        String Slices = Sliceinput.next();
        int SlicesPerZa = Integer.parseInt(Slices);

        int TotalSlices =(totalPizza*SlicesPerZa);

        System.out.print(guests+" people with "+totalPizza+" pizzas("+TotalSlices+" slices)\n");
        int ZaPerGuest =TotalSlices/guests;
        int RemainingZa = TotalSlices%guests;
        System.out.print("Each person gets "+ZaPerGuest+" pieces of pizza.\n");
        System.out.print(RemainingZa+" slices of pizza remain\n");


    }
}
