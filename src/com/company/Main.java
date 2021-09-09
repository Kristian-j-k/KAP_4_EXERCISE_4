EXERCISE 4
        første kode virker, men gør ingen ting,
        anden kode virker ikke fordi string ikke kan multipliceres med 7, desuden er 7 uden for parentesen

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
int c = 1;
int d = 2;
        boo( c , d );

    }
    public static void boo(int a,int b){
         //not doing anything
    }
    System.out.println("boo!") + 7; //fejl: "not a statement"
}
