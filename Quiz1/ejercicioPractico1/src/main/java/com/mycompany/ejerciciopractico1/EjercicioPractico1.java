/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciopractico1;

import javax.swing.JOptionPane;

/** 
 *
 * @author HP
 */
public class EjercicioPractico1 {

    public static void main(String[] args) {
        //Este codigo trata sobre el monto total que una empresa tiene que pagar a la CCSS
        
        //Declaracion de variables y preguntar al usuario por la informacion
        
        String lectura;
        int empleados;
        lectura = JOptionPane.showInputDialog("Digite la cantidad de empleados:");
        empleados = Integer.parseInt(lectura);
        int salario;
        lectura = JOptionPane.showInputDialog("Digite el salario por empleado:");
        salario = Integer.parseInt(lectura);
        
        //Calcular el SEM e IVM
         double sem = salario * 0.0925;
         double ivm = salario * 0.0508;
         total sem += sem;
         total ivm += ivm;
       
        //Sumatorio de los salarios y monto total
        for (int i = 0; i < salario; i++){
            System.out.println("El salario total es de:"+salario);
          
           }
        }
        
            
        }
    
}
