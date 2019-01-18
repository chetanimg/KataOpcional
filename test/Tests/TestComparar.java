/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import comparar.comparaArray;
import static junit.framework.Assert.*;
import org.junit.Test;
import org.junit.BeforeClass;


public class TestComparar {
    
    static int bien1[];
    static int bien2[];
    static int bien3[];
    static int bien4[];
    static int vacio[];
    static int mal1[];
    static int mal2[];
    static int mal3[];
    static int mal4[];
    static int mal5[];
    
    @BeforeClass
    public static void inicio() {
        bien1 = new int [] {121,144,19,161,19,144,19,11};
        bien2 = new int [] {121,14641,20736,361,25921,361,20736,361};
        bien3 = new int [] {2};
        bien4 = new int [] {4};
        vacio = new int [] {};
        mal1  = new int [] {1,2,3};
        mal2  = new int [] {4,5,6};
        mal3  = new int [] {121,14,19,161,19,144,19,11};
        mal4  = new int [] {1};        
    }
   
    @Test
    public void generico_true() {
        assertTrue(comparaArray.comparaArrayCuadrado(bien1,bien2));
    }  
    @Test
    public void vacios_ambos(){
        assertTrue(comparaArray.comparaArrayCuadrado(vacio,vacio));
    }
    @Test
    public void vacio_uno(){
        assertFalse(comparaArray.comparaArrayCuadrado(mal1,vacio));
    }
    @Test
    public void generico_false(){
        assertFalse(comparaArray.comparaArrayCuadrado(mal1,mal2));
    }
    @Test
    public void solo_un_elemento_true(){
        assertTrue(comparaArray.comparaArrayCuadrado(bien3, bien4));
    }
    @Test
    public void solo_un_elemento_false(){
        assertFalse(comparaArray.comparaArrayCuadrado(mal4,bien3));
    }
}
