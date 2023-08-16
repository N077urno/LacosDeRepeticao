/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lacosderepeticao;

/**
 *
 * @author nando
 */
public class Lacos {
    //Métodos
    public void lacoWhile(int num){
        int i = 0;
        
        while(i < num){
            System.out.println("Laco while: Valor de i..: "+i);
            i++;
        }
    }
    
    public void lacoDoWhile(int num){
        int i = 0;
        
        do{
            System.out.println("Laco do-while: Valor de i..: "+i);
            i++;
        }while(i < num);
    }
    
    public void lacoFor(int num){
        for(int i=0;i<num;i++){
            System.out.println("Laco for: Valor de i..: "+i);
        }
    }
}
