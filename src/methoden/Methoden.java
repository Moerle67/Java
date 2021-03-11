/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methoden;

/**
 *
 * @author moerli
 */
public class Methoden {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int zahl = 21;
        System.out.println("Startzahl: "+zahl);
        int neueZahl = verdoppele(zahl);
        System.out.println("Neue Zahl: "+neueZahl);
        System.out.println("Startzahl: "+zahl);
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        verdoppele(cars);
        System.out.println("Cars"+cars[0]);
        System.out.println(verdoppele("Test"));
        System.out.println("Taschenrechner");
        System.out.print("Geben Sie die erste Zahl ein:  ");
        System.out.print("Geben Sie die zweite Zahl ein: ");
        System.out.print("Geben Sie den Operator (+-*/%) ein: ");
        System.out.print("Die Gleichung mit Ergebnis lautet: ");
        FrameTaschenrechner.main(args);
    }
    
    public static int verdoppele(int eingabe) {
        System.out.println("Int wird aufgerufen");
        eingabe = eingabe + eingabe;
        return eingabe; // eingabe*2
    }
    // Überladen Methoden
    public static String verdoppele(String[] eingabe) {
        System.out.println("String Array wird aufgerufen");
        eingabe[0] = "Trabant";
        return "";
    }
    public static String verdoppele(String eingabe) {
        System.out.println("String wird aufgerufen");
        eingabe += eingabe;
        return eingabe;
    }
    
    public static int addiere(int zahl1, int zahl2) {
        return zahl1 + zahl2;
    }

    static int subtrahiere(int zahl1, int zahl2) {
        return zahl1 - zahl2;
    }
    static double dividiere(int zahl1, int zahl2) {
        return (double) zahl1 / zahl2;
    }
    static int multipliziere(int zahl1, int zahl2) {
        return zahl1 * zahl2;
    }
    
    static int modulo(int zahl1, int zahl2) {
        return zahl1 % zahl2;
    }

}
