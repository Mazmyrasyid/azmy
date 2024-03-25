/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tugas1;

import java.util.Scanner;

/**
 *
 * @author A-14
 */
public class NewClass {
    public static void main(String[] args) {
    
    int nilaiA = 10 ;
    int nilaiB = 20 ;
    
    
    
    
    double nilaiC = 30 ;
    double nilaiD = 40 ;
    
    boolean isPlus = true ;
    
    System.out.println("nilai A: " + nilaiA);
    System.out.println("nilai B: " + nilaiB);
    System.out.println("nilai C: " + nilaiC);
    System.out.println("nilai D: " + nilaiD);
    System.out.println("isPlus: + " + isPlus);
    
    Scanner input = new Scanner(System.in);
        System.out.println("masukksn angka variabel A");
            nilaiA = input.nextInt();
        System.out.println("masukksn angka variabel B");
            nilaiB = input.nextInt();
        System.out.println("masukksn angka variabel C");
            nilaiC = input.nextDouble();
        System.out.println("masukksn angka variabel D");
            nilaiD = input.nextDouble();
        
        System.out.println("masukkan teks");
        String teks = input.nextLine();
        teks = input.nextLine();
         
         
         System.out.println("nilai A: " + nilaiA);
         System.out.println("nilai B: " + nilaiB);
         System.out.println("nilai C: " + nilaiC);
         System.out.println("nilai D: " + nilaiD);
         System.out.println("isPlus: " + isPlus);
         System.out.println("Teks: " + teks);
         
         
         
         
        
        
        
        
        
   
    
}
}

