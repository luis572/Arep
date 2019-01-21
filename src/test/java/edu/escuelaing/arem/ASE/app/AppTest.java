package edu.escuelaing.arem.ASE.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


import java.util.*;
import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }
    /**
	 * Este test se realiza para la media y  desviacion   de la columna uno
    */
    @org.junit.Test
    public void testMediaYDesviacion1() throws Exception {
       Operaciones test1= new Operaciones("prueba.txt");
       System.out.println(test1.media(test1.getLeerDatos().getColumna1()));
       assertEquals(test1.media(test1.getLeerDatos().getColumna1()),550.6);
       System.out.println(test1.desviacion(test1.getLeerDatos().getColumna1()));
       assertEquals(test1.desviacion(test1.getLeerDatos().getColumna1()),572.03);
    }
    /**
	 * Este test se realiza para la media y  desviacion   de la columna dos
    */
    public void testMediaYDesviacion2() throws Exception {
       Operaciones test1= new Operaciones("prueba.txt");
       System.out.println(test1.media(test1.getLeerDatos().getColumna2()));
       assertEquals(test1.media(test1.getLeerDatos().getColumna2()),60.32);
       System.out.println(test1.desviacion(test1.getLeerDatos().getColumna2()));
       assertEquals(test1.desviacion(test1.getLeerDatos().getColumna2()),62.26);
       
    }
    

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
