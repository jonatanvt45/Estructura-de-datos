package main;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack pila = new Stack<String>(); //Pila de tipo String
        
        char[] abced; //Arreglo de la pila 
        abced = new char[27]; 
        for (int i = 26; i > 0; i--) {
            abced[i] = (char) ('`' + i);//96 + 
            pila.push(abced[i]);
        }
        while (pila.empty() == false) {
            System.out.println(pila);
            pila.pop();
        }
        
    }

}
