/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lacosderepeticao;

/**
 *
 * @author nando
 */
public class LacosDeRepeticao {

    public static void main(String[] args) {
        Lacos lacos = new Lacos();
        
        lacos.lacoWhile(10);
        System.out.println("---------");
        lacos.lacoDoWhile(10);
        System.out.println("---------");
        lacos.lacoFor(10);
    }
}
