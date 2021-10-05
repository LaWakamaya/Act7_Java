/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act7_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alan Franco
 */
public class Act7_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Cuantos numeros desea obtener en los arreglos?");
        int cant = Integer.parseInt(br.readLine());
        
        Algoritmos a = new Algoritmos(cant);
        
        a.Imprimir();
    }
    
}
