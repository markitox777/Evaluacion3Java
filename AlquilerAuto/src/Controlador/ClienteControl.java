/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Bd.Conexion;
import Modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
/**
 *
 * @author Cetecom
 */
public class ClienteControl {
    Conexion cx;

    public ClienteControl() {
        cx= new Conexion();
        cx.conectar();
    }
    
    public List<Cliente> BuscarCliente(){
        List<Cliente> Clientes= new ArrayList<>();
        String query="SELECT * FROM CLIENTE;";
        
        try {
            ResultSet rs= cx.EjecutarQuery(query);
            
            while(rs.next()){
                Clientes.add(new Cliente(
                        rs.getInt("rut"),
                        rs.getString("nombre"),
                        rs.getString("numeroContacto"),
                        rs.getString("direccion"),
                        rs.getString("tipoCliente")
                ));
            }
        } catch (Exception e) {
            System.out.println("No se encontro el cliente"+e.getMessage());
        }
        return Clientes;
    }
    
    
    public void agregarCliente(int rut,String nombre, int numeroContacto,String direccion,String tipoCliente){
        String query= "INSERT INTO cliente (rut,nombre,numeroContacto,direccion,tipoCliente) VALUES (?,?,?,?,?);";
        
        try {
            PreparedStatement st= cx.getConnection(tblLista).prepareStatement(query);
            st.setInt(1, rut);
            st.setString(2, nombre);
            st.setInt(3, numeroContacto);
            st.setString(4, direccion);
            st.setString(6, tipoCliente);
            System.out.println("Se agrego correctamente el cliente");
        } catch (Exception e) {
            System.out.println("No se pudo agregar el cliente"+e.getMessage());
        }
    }
    
    public void eliminarCliente(int rut){
        String query= "DELETE FROM CLIENTE WHERE rut= "+rut+";";
        
        try {
            PreparedStatement st= cx.getConnection(tblLista).prepareStatement(query);
                st.setInt(1, rut);
                System.out.println("Se elimino correctamente el cliente.");
        } catch (Exception e) {
            System.out.println("No se pudo eliminar el cliente"+e.getMessage());
        }
    }
    
    public void editarCliente(int rut,String nombre, int numeroContacto,String direccion,String tipoCliente){
        String query= "ALTER TABLLE cliente WHERE rut= "+rut+";";
        
        try {
            PreparedStatement st= cx.getConnection(tblLista).prepareStatement(query);
            st.setInt(1, rut);
            st.setString(2, nombre);
            st.setInt(3, numeroContacto);
            st.setString(4, direccion);
            st.setString(6, tipoCliente);
            System.out.println("Se edito correctamente el cliente");
        } catch (Exception e) {
            System.out.println("No se pudo editar el cliente"+e.getMessage());
        }
    }
    
}
