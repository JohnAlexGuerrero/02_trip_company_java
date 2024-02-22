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
    static void destinoReservado(int destinoId,int horaId, int asientosNumero,int vuelos[][]){
        int asientosDisponibles = vuelos[destinoId][horaId];
        
        if(asientosDisponibles >= asientosNumero){
            vuelos[destinoId][horaId] = asientosDisponibles - asientosNumero;
            System.out.println("su reserva fue realizada con exito");
        }else{
            System.out.println("disculpe, no se pudo completar su operacion dado que no hay asientos disponibles");
        }
    }
    
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        
        //matriz de destino vs horarios de vuelos
        int vuelos[][] = new int[6][3];
        String destinos[] = {"Rio de Janeiro","Cancun","Madrid","Roma","Milan","Iguazu"};
        String respuesta = "";
        
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
            int destinoId = enter.nextInt();
            
            //boolean bandera = destinoDisponible(destinoId, destinos);
            
            if(destinoId < destinos.length){
                System.out.println("Horarios disponibles:");
                System.out.println("0 mañana.\n 1 mediodia.\n 2 noche");
                int horaId = enter.nextInt();
                
                System.out.println("Total de asientos a reservar");
                int asientosNumero = enter.nextInt();
                
                destinoReservado(destinoId, horaId, asientosNumero,vuelos);
                
            }else{
                System.out.println("El destino seleccionado no esta disponible");
            }
            
            System.out.println("Desea seguir reservando vuelos?");
            System.out.println("si, continuar.");
            System.out.println("finish, terminar.");

            respuesta = enter.next();
            
        } while(!respuesta.equalsIgnoreCase("finish"));
        
    }
    
}
