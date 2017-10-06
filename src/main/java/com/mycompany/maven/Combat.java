/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maven;

/**
 *
 * @author kazzbo
 */
public class Combat
{
    public Combat(Perso j1, Perso j2)
    {
     Guerrier G = (Guerrier) j1;   
     Mage M = (Mage) j2;
        
        while (G.pv >= 0 && M.pv >= 0 )
        {
            M.pv = M.pv - G.epee.dgt;
            System.out.println("le mage perd " +G.epee.dgt + " pv");
            G.pv = G.pv - M.baton.dgt;
            System.out.println("le guerrier perd " + M.baton.dgt + " pv");
            System.out.println("Le Mage a : " + M.pv + "PV");
            System.out.println("Le Guerrier a : " + G.pv + "PV");
        }
    }
    
}
