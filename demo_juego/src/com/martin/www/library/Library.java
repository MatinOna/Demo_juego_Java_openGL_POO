/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.www.library;

import com.martin.www.interfaz.Displayable;

/**
 *
 * @author Martin
 */
public final class Library {
    
    private Library()
    {
    }
    
    public static float distanciEuclideana(Displayable a, Displayable b)
    {
        return (float) Math.sqrt(Math.pow(a.getX()-b.getX(),2)+Math.pow(a.getZ()-b.getZ(),2));
    }
    
}
