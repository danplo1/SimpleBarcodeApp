package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    int polishStartCode = 590;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz kod kreskowy: ");

        String EAN13 = scanner.nextLine();


        //String EAN13 = "590123123123"; //EAN13 nazwa własna
    if (EAN13.startsWith(String.valueOf(polishStartCode))){ //metoda valueOf zamienia inta na Stringa
        System.out.println("To jest polski produkt!");
    }else{
        System.out.println("To nie jest polski produkt!");
    }

    }
}
