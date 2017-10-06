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
public abstract class Perso implements Levels{

public int lvl = 1;
public static int pv = 10;
public float xp = 0f;
//private boolean PNJ = false;

public String nom = "";


// Setteur
public int setLvl(int lvl)
{
    return this.lvl = lvl;
}
public void setXp(float xp)
{
    this.xp = xp;
}
 public void setPv(int xp)
{
   this.xp = xp;
}
public void setName(String name)
{
    this.nom = name;
}
 // Getteur
public int getLvl()
{
   return this.lvl;
}
public int getPv()
{
   return this.pv;
}
 public float getXp()
{
   return this.xp;
}
public String getName()
{
return this.nom;
}




}