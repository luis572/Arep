/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.app;
import static java.lang.Math.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.io.IOException;
import java.nio.file.*;


/**
 *
 * @author Luis
 */
public  class Lectura {
    public static LinkedList<Double> columna1;
    public static LinkedList<Double> columna2;
    public  static FileReader archivoAleer;
    public Lectura(String tets) throws Exception{
        columna1=new LinkedList<>();
        columna2=new LinkedList<>();
        archivoAleer= new FileReader(Paths.get("src/test/java/edu/escuelaing/arem/ASE/app/"+tets).toString());
        leer();
    }
  
     public static  void   leer() throws Exception{
        
        try {
            
            String cadena;
            BufferedReader b;
            b = new BufferedReader(archivoAleer);
            while((cadena = b.readLine())!=null) {
                String[] tupla=cadena.split(" ");
                Double a =Double.parseDouble(tupla[0]);
                Double c =Double.parseDouble(tupla[1]);
                columna2.add(c);
                columna1.add(a);
            }
            b.close();
        
        } catch (Exception e) {
			System.out.println("");
			
		} 
        
        
    }
    public static LinkedList<Double> getColumna1() {
        return columna1;
    }

    public static LinkedList<Double> getColumna2() {
        return columna2;
    }
}
