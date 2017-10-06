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
public class Guerrier extends Perso
{
    public int rage = 100;
    Epee epee = new Epee();
    public int pvW = 5;
    int pv = 15;

public void setPv()
{
    this.pv = this.pv + 5;
}

public int getPv()
{
    return this.pv;
}

}