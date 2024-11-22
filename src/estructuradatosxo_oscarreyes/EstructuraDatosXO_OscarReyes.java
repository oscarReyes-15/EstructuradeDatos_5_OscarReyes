/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuradatosxo_oscarreyes;

import javax.swing.*;
import java.util.Random;

public class EstructuraDatosXO_OscarReyes {
    
    //Diccionario de Variables
    Random R = new Random();
    int Turno = 1, ContadorEspacios = 0;
    String[] Jugadores = new String[2];
    String[][] Arreglo = {
        {" ", " ", " "},
        {" ", " ", " "},
        {" ", " ", " "},
    };
    
    //Funciones del Juego
        public String turnoJugador(){
            
            if (Jugadores[0] != null && Jugadores[1] != null){
                if(Turno == 1){
                    Turno = 2;
                    System.out.println("bb -> " + Turno);
                    return "X";
                }
                else {
                    Turno = 1;
                    return "O";
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Ingrese los jugadores!!!");
                return "";
            }
        }
    
        void establecerJugador(String Jugador, int a){
            //Establece Jugadores 1 y 2
            switch (a){
                case 1 -> {
                    Jugadores[0] = Jugador;
                }
                case 2 -> {
                    Jugadores[1] = Jugador;
                }
            }
                       
        }
        
        static void validarPosicion(){
            JOptionPane.showMessageDialog(null, "Casilla Ocupada!!!");
        }
        
        public void ganoJugador(){
            //Valida posiciones 
            
                //Empate
                for(int i = 0; i < 3; i++){
                    for (int j =0; j < 3; j++){
                        if (!Arreglo[i][j].equals(" ")){
                            ContadorEspacios += 1;
                            System.out.print(ContadorEspacios);
                        }
                        else{ContadorEspacios = ContadorEspacios;}
                    }
                }    
                if(ContadorEspacios > 8){
                    JOptionPane.showMessageDialog(null, "EMPATE!!!");
                    System.exit(0);
                }
                ContadorEspacios = 0;
                
                //Lineas Horizontales
                if (
                    ((Arreglo[0][0]).equals("X") && (Arreglo[0][1]).equals("X") && (Arreglo[0][2]).equals("X")) 
                 || (Arreglo[1][0]).equals("X") && (Arreglo[1][1]).equals("X") && (Arreglo[1][2]).equals("X") 
                 || (Arreglo[1][0]).equals("X") && (Arreglo[2][1]).equals("X") && (Arreglo[2][2]).equals("X") )
                
                {
                    JOptionPane.showMessageDialog(null, "GANO Jugador!!!" );
                    System.exit(0);
                }
        }
        
}
