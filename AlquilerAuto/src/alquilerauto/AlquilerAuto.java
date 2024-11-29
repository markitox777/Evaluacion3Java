/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alquilerauto;

import Bd.Conexion;
import Views.MenuCliente;


/**
 *
 * @author Cetecom
 */
public class AlquilerAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion cx= new Conexion();
        cx.conectar();
        
        MenuCliente mn= new MenuCliente();
        mn.setVisible(true);
        
        
        
    }
    
}
