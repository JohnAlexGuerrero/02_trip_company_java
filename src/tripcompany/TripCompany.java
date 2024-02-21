/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tripcompany;

import java.util.Scanner;

/**
 *
 * @author JOHN
 */
public class TripCompany {

    //validar el destino escogido por el usuario
    static boolean destinoDisponible(int destino, String vuelos[]){
        
        return false;
    }
    
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        
        //matriz de destino vs horarios de vuelos
        int vuelos[][] = new int[6][3];
        String destinos[] = {"Rio de Janeiro","Cancun","Madrid","Roma","Milan","Iguazu"};
        
        //carga de asientos de manera automatica y aleatoria
        for(int i=0; i< 6;i++){
            for(int j=0; j< 3; j++){
                vuelos[i][j] = (int)(Math.random() * 121);
            }
        }
        
        //mostrar destinos disponibles
        do {
            System.out.println("Destinos disponibles:");
            
            for(int i=0; i<destinos.length;i++){
                System.out.println(i + " " + destinos[i]);
            }
            
            System.out.println("Escoge tu destino: ");
            int destino = enter.nextInt();
            
            boolean bandera = destinoDisponible(destino, destinos);
            
            if(bandera){
                
            }else{
                System.out.println("El destino seleccionado no esta disponible");
            }
            
            
        } while (false);
        
    }
    
}
