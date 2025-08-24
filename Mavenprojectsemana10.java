/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenprojectsemana10;

/**
 *
 * @author ADMIN
 */
public class Mavenprojectsemana10 {

    public static void main(String[] args) {
        double[][] matriz ={
        {1.4, 2.8, 5.6, },
        {3.5, 7.1, 8.2,},
        
        };
    double suma = 0.0;
    for(int x=0;x<matriz.length;x++){
     for(int y=0;y<matriz[x].length;y++)
     {
       suma += matriz[x][y];  
     }     
    }
    System.out.println("la suma total es" + suma);
    }
}
