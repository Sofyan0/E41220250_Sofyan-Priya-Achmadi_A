/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package balok;
import java.util.Scanner;
/**
 *
 * @author ADI
 */
public class Balok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan panjang: ");
        int p = input.nextInt();
        System.out.print("Masukan panjang: ");
        int l = input.nextInt();
        System.out.print("Masukan panjang: ");
        int t = input.nextInt();
        
        int luasPermukaan = 2 * ((p * l) + (p * t) + (l * t));
        System.out.println("Luas permukaan Balok adalah: " + luasPermukaan);
        
        int volume = p * l * t;
        System.out.println("Volume Balok adalah: " + volume);
    }
        
    
}
