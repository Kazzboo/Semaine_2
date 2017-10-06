/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maven;
import java.util.Scanner;
/**
 *
 * @author kazzbo
 */
public class Main {
    
    public static void main(String[] av)
    {
        
        Scanner input = new Scanner(System.in);
        Guerrier g1 = new Guerrier();
        Mage m1 = new Mage();
        
        
        System.out.println(" enter name J1 :");
        String nameJ1 = input.next();
        g1.setName(nameJ1);
        
        System.out.println(" enter name J2 :");
        String nameJ2 = input.next();
        m1.setName(nameJ2);
        
        
        System.out.println(m1.nom + " à  " + m1.mana + " de mana.");
        System.out.println(g1.nom + " à  " + g1.rage + " de rage" + "  est j'ai : " + g1.pv + " PV");
        
        Perso J1 = g1;
        Perso J2 = m1;
        
       Combat arene = new Combat(J1, J2);
        
        
        
        
    }
    
    
    
}
