/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act7_java;

/**
 *
 * @author Alan Franco
 */
public class Algoritmos {
    
    int n;
    int primos [];
    double fibonacci [];
    
    public Algoritmos(int n){
        this.n = n;
        primos = new int [n];
        calcularPrimos();
        fibonacci = new double [n];
        calcularFibonacci();
    }
    
    private void calcularPrimos(){
        int index = 2;
        primos [0] = 1;
        boolean prim = false;
        for (int i = 1; i < n; i++) {
            while(!prim){
                for (int j = index-1; j >= 1; j--) {
                    if(j-1 <= 1){
                        if(index%j != 0 || index == 2){
                            prim = true;
                        }
                    }
                    else if(index%j == 0){
                        break;
                    }
                }
                if(prim){
                    primos [i] = index;
                }
                index++;
            }
            prim = false;
        }
    }
    
    private void calcularFibonacci(){
        fibonacci [0] = 0;
        fibonacci [1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacci [i] = (fibonacci [i-1] + fibonacci [i-2]);
        }
    }
    
    public void Imprimir(){
        System.out.println("Numeros primos:");
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            if(i == n-1)
                System.out.print(primos [i]);
            else
                System.out.print(primos [i] + ", ");
        }
        System.out.println("]");
        System.out.println("Sucesion de Fibonacci:");
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            if(i == n-1)
                System.out.print(fibonacci [i]);
            else
                System.out.print(fibonacci [i] + ", ");
        }
        System.out.println("]");
    }
}
