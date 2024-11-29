/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Cetecom
 */
public class Cliente {
    private int rut;
    private String nombre;
    private String numeroContacto;
    private String direccion;
    private String tipoCliente;

    public Cliente() {
    }

    public Cliente(int rut, String nombre, String numeroContacto, String direccion, String tipoCliente) {
        this.rut = rut;
        this.nombre = nombre;
        this.numeroContacto = numeroContacto;
        this.direccion = direccion;
        this.tipoCliente = tipoCliente;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", nombre=" + nombre + ", numeroContacto=" + numeroContacto + ", direccion=" + direccion + ", tipoCliente=" + tipoCliente + '}';
    }
    
    
    
    
    
}
